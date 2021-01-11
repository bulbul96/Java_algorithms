package arrays;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[]args) {
		
		//An array is a data structure that contains a group of elements
		//An array is a collection of one or more values of the same type.
		//Each value is called an element of the array. The elements of the array share the same variable name
		//but each element has its own unique index number (also known as a subscript). An array can be of any type, For example: int , float , char etc.
		//An array is a variable that can store multiple values. For example, if you want to store 100 integers, you can create an array for it. int data[100];
		
		
		//Array is a fixed length data structure
		//Array list--is a dynamic length data structure
		
		
		ArrayList<Integer>age=new ArrayList<Integer>();//data type here integer, variable name here is 'age'
	    
		age.add(7);//add is method here
		age.add(12);
		age.add(25);
		age.add(9);
		
		System.out.println((age.get(2)));
		
		//age.remove(2);//remove a value
		
		age.add(100);
		
		System.out.println(age.get(4));
		
		age.add(1, 346);//replace a value from array list
		
		System.out.println(age.get(1));
		
        System.out.println("Length of the ArrayList is: "+age.size());
		
	}

}
