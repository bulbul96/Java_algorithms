package javapracticeWithShuvashish;

public class FindNumberPresentArray {

	public static void main(String[] args) {
	
int[] numbers= {2, 5, 3, 4, 5, 7, 20, 8, 9, 4, 7 };
String names[]= {"Bulbul", "Kajol", "Liton", "Subashish"};

int total=0;
int checkNumber=5;
for(int i=0; i<numbers.length; i++) {
	if(numbers[i]==checkNumber) {
		total=total+1;
	}
	
}
System.out.println("total "+total);
	}

}
