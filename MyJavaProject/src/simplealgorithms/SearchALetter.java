package simplealgorithms;

public class SearchALetter {

	public static void main(String[] args) {
		
		// 
		
		String name="CarrerHackeeee";
		char find='e';
		int c=0;
		
		for(int i=0; i<name.length(); i++) {
			if(find==name.charAt(i)) {
				System.out.println("Found "+find+ " on Position "+i);
			//break;   //break will stop
				c++;
			}
			
		}//end for
		if(c>1)
			System.out.println(find + " is duplicate and exists "+c+ " times");

	}//end main

}//end class
