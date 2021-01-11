package javapracticeWithShuvashish;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		

		List<String>nameList=new ArrayList<>();
		nameList.add("Shuvashish");
		nameList.add("Bulbul");
		nameList.add("Kajol");
		nameList.add("Dipak");
		nameList.add("Liton");
		System.out.println(nameList.get(3));
		
		for(String name: nameList) {
			System.out.println(name);
		}
	}

}
