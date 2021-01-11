package javapracticeWithShuvashish;

public class MethodClass {

	public static void main(String[] args) {
		firstMethod(9, 10);
		firstMethod(10, 20);
	}
private static void firstMethod(int num1, int num2) {
	//System.out.println("inside a method");
	
	//int num1=8;
	//int num2=10;
	int result=num1+num2;
	System.out.println("result is "+result);
}
}
