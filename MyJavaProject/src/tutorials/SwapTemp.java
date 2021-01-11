package tutorials;

public class SwapTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=15;
		//int temp;
		System.out.println("Before swap: "+x+" : "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap: "+x+" : "+y);
	}

}
