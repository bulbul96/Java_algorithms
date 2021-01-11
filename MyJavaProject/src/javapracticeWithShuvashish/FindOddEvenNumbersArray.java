package javapracticeWithShuvashish;

public class FindOddEvenNumbersArray {
	
	public static void main(String args[]){  
		
		int a[]={2,5,3, 5, 5, 10,5,7, 9, 10};  
		System.out.println("Odd Numbers:"); 
		
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		}
	
	}  


