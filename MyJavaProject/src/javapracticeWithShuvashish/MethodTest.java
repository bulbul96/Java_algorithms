package javapracticeWithShuvashish;

public class MethodTest {

	public static void main(String[] args) {
	
		int[] numbers1= {-2, -5, -3, -55, -10, -8};
		int[] numbers2= {2, 5, 53, 3, 55, 10, 8};
		int[] numbers3= {2, 5, 3, 36, 56, 10, 8};
		
				firstMethod(9, 10);
				firstMethod(10, 20);
				findLargestNumber(numbers1);
				findLargestNumber(numbers2);
				findLargestNumber(numbers3);
				int maxNumber=findLargestNumber(numbers2);
			}
		private static void firstMethod(int num1, int num2) {
			//System.out.println("inside a method");
			
			//int num1=8;
			//int num2=10;
			int result=num1+num2;
			System.out.println("result is "+result);
		}
		private static int findLargestNumber(int[] numbers) {
			int maxNumber=numbers[0];
			
			//int maxNumber=0;
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i]>maxNumber) {
					maxNumber=numbers[i];
				}
		}
			System.out.println(maxNumber);
			return maxNumber;
	}

}
