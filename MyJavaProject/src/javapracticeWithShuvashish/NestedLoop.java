package javapracticeWithShuvashish;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			System.out.println("inside loop i "+i);
			for(int j=0; j<3; j++) {
				System.out.println("inside loop j "+j);
			}
			System.out.println();
		}

	}

}
