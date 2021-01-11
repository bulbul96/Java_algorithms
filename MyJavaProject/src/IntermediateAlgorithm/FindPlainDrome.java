package IntermediateAlgorithm;

public class FindPlainDrome {

	public static void main(String[] args) {
		// madam--plaindrome(mom, dad)
		
		
		String text="madam";
		String reverse="";
		
		for(int i=text.length()-1; i>=0; i--) {
			reverse=reverse+text.charAt(i);
			
		}
//compare memory location
		//.equal() compares by value
		
		if(text.contentEquals(reverse))
			System.out.println(text+" is a plaindrome");
		else
			System.out.println(text+ " is not a plaindrome");
	}

}
