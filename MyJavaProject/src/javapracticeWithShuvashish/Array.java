package javapracticeWithShuvashish;

public class Array {
public static void main(String[] args) {
		
		
		int[] numbers= {2, 5, 3, 4, 9, 10};
		int[] nums2=new int[5];
		nums2[0]=6;
		nums2[1]=1;
		nums2[2]=9;
		nums2[3]=3;
		nums2[4]=8;
		
System.out.println(numbers[3]);
int sum=0;
for(int i=0; i<numbers.length; i++) {
	sum=sum+numbers[i];
}
System.out.println(sum);

String names[]= {"Bulbul", "Kajol", "Liton", "Subashish"};
System.out.println(names[2]);
System.out.println(names[0].charAt(3));
System.out.println(names[0].indexOf("ul"));
	}

}


