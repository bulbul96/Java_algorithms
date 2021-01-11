package maps;

import java.util.HashMap;

public class AnotherHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> course=new HashMap();
		
		course.put(001,  "Science");
		course.put(002, "Math");
		course.put(003, "Advnaced Math");
		System.out.println(course);
		System.out.println(course.get(002));
	}

}
