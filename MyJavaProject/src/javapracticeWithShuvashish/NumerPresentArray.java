package javapracticeWithShuvashish;

public class NumerPresentArray {

	public static void main(String[] args) {
		
		
		int[] numbers= {2, 5, 3, 4, 5, 7, 20, 8, 9, 4, 7 };
		String names[]= {"Bulbul", "Kajol", "Liton", "Subashish"};

		int total=0;
		int checkNumber=3;
		char checkChar='o';
		
		
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length(); j++) {
				if(names[i].charAt(j)==checkChar)
			
				total=total+1;
			}
			
		}

		System.out.println(total);
}			
		
		}
		


