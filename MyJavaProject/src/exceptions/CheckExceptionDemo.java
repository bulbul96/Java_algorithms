package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptionDemo {

	public static void main(String[] args) {//throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		//Errors--we cannot handle java error (low Memory, jvm not responding)
		//exceptions--we can handle exceptions
		
		//Exceptions types--Checked and UnChecked
		
		//Checked--compiler exception--we cannot even run our code without handling exception(error before running the code)
		
		//unchecked--runtime exception--error after running the code
		//we can run our code without handling Unchecked exception but java display
		
		//Throwable class==---Exception class---RunTimeException
		
		
		File file=new File("test.text");
		FileReader fr=null;
		
		try {
			fr=new FileReader(file);
		} catch(FileNotFoundException e) {
			System.out.println("The file doesn't Exit" +file.toString());
		}catch (Exception e) {
		//	FileReader fr=new FileReader(file);
		//} catch (FileNotFoundException e) {
			System.out.println("This is the second exception");
		}finally {
			System.out.println("Finally block always get executed");
			// TODO Auto-generated catch block
			//e.printStackTrace();
			try {
				fr.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.println("The file doesn't exist "+file.toString());
		}
		
		
		//how do we handle exceptions? 2 ways:
		//we can throw an exception---throw/throws
		//catch an exception---try/ catch/ finally block
	}

}
