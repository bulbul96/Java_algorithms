package javapracticeWithShuvashish;

public class SumofOddEvenArray {

	
		
		public static void main(String args[]){
			int arr[]={2,5,3, 5, 5, 10,5,7, 9, 10};
			int oddSum=0,evenSum=0;
			for(int i=0; i<10; i++){
			if(arr[i]%2==0){
			evenSum=evenSum+arr[i];
			}
			else{
			oddSum=oddSum+arr[i];
			}
			}
			System.out.println("\nSum of even is: "+evenSum);
			System.out.println("\nSum of odd is: "+oddSum);
			}
			

	}


