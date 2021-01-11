package String;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
	
		ArrayList<String> state=new ArrayList<String>();
		
		state.add("NY");
		state.add("NJ");
		state.add("VA");
		state.add("MN");
		state.add("CT");
		
		System.out.println(state);
		state.remove(1);
		
		state.add(2, "TX");
		System.out.println(state);

	}

}
