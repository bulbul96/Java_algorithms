package maps;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
		/*
		 * HashMap is a Map based collection class that is used for storing Key & value pairs, it is denoted as HashMap<Key, Value> or HashMap<K, V>. 
		 * This class makes no guarantees as to the order of the map. It is similar to the Hashtable class except that it
		 *  is unsynchronized and permits nulls(null values and null key). Maps are used for when you want to associate a key with a value and Lists are an ordered collection. ... HashMap are efficient for 
		 *  locating a value based on a key and inserting and deleting values based on a key. The entries of a HashMap are not ordered. ArrayList and LinkedList are an implementation of the List interface.
		 *  HashMap does not allow duplicate keys however it allows to have duplicate values. HashSet permits to have a single null value. HashMap permits single null key and any number of null values.
		 */
		
		Map<String, Integer> score=new HashMap<>();
		score.put("Bulbul", 100);
		score.put("John", 100);
		score.put("Alok", 99);
		score.put("John", 98);
		
		System.out.println(score);
		
		System.out.println(score.get("Alok"));
		
		score.remove("Jhon");
		
		System.out.println(score);
		
		HashMap<String, Integer> grades =new HashMap<>();
		grades.remove("Bulbul", 12);
		
		System.out.println(grades);
				

	}

}
