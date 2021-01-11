package String;

public class DenoString {
public static void main(String[]args) {
	//primitive & non-primitive
	//char-primitive data type
	//String -non primitive data type
	//immutable-not changeable
	
	String text="CareerHack";
	text=text+" ";
	text =text+ "is a IT Training Center";
	
	
	
	System.out.println(text);
	
	String myText=new String("CareerHack");
	myText+=" ";
	myText+="is a IT Training Center";
	
	System.out.println(myText);
}
}
