package Assignment2;

public class FindSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x= {100, 89, 123, 87, 110, 98};
		int maxOne=-1;
		int maxTwo=-1;
		
		for(int i=0; i<x.length; i++) {
			
			if(maxOne<x[i]) {
				maxTwo=maxOne;
				maxOne=x[i];
							
			
		}
		else if(maxTwo<x[i])
			maxTwo=x[i];
	}
System.out.println(maxOne);
System.out.println(maxTwo);
	}
}
