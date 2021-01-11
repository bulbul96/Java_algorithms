package sets;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	public static void main(String[]args) {
		
		//set interface doesn't accept duplicate
		//Set interface is sorted and doesn't accept duplicate
		
		HashSet<String> names=new HashSet<String>();
		
		names.add("Bulbul");
		names.add("John");
		names.add("Alok");
		names.add("John");
		
	System.out.println(names);
	System.out.println("Size of the set: "+names.size());
	
	names.clear();
	System.out.println(names);

	Set<Integer> score=new HashSet<Integer>();
	
	score.add(100);
	score.add(99);
	
	System.out.println(score);
}
}
