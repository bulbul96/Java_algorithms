package tutorials;

public class Continue {

	public static void main(String[] args) {
	//break, continue
		//Don't print 7 and print the rest
		
		for(int i=1; i<=10; i++) {
			if(i==7) {
				//continue;
				
				break;
			}
			System.out.println("value is " + i);
		}

	}

}
