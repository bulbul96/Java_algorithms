package arrays;

public class ReverseByWords {

	public static void main(String[] args) {
		
		String text ="This is my dup test";
		String[] s=text.split("\\s");
		
		for(int i=0; i<s.length; i++) {
			//initial condition, 2nd =stop condition, 3rd=increment or decrement condition
			String reverse="";
			for(int j=s[i].length()-1; j>=0; j--) {
				
				reverse=reverse+s[i].charAt(j);
				
			}
			System.out.println(" "+reverse);
		}
				

	}

}
