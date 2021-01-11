package javapracticeWithShuvashish;

public class TotalOfOddEven {
	
public static void main(String[] args) {
		
		//find the largest string
		
		int[] numbers= {2, 5, 3, 4, 5, 7, 20, 8, 9, 4, 7 };
		String names[]= {"Bulbul", "Kajol", "Liton", "Subashish"};
		System.out.println(findlargestString(names));
		findSum(names, numbers);
	}

	public static String findlargestString(String[] names) {
		
		String word=names[0];
		int totalchars=0;
		
		for(int i=0; i<names.length; i++) {
			totalchars=totalchars+names[i].length();
		}
					
		System.out.println("total "+totalchars);
			
			
			return word;
		}
private static void findSum(String[] strings, int[] numbers) {
	int sum1=0;
	int sum2=0;
	for(int i=0; i<strings.length; i++) {
		if(strings[i].length()%2==1);
		sum1=sum1+strings[i].length();
	}
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i]%2==0)
			sum2=sum2+numbers[i];
	}
	int sum=sum1+sum2;
	System.out.println("Sum is "+sum);
}

}


