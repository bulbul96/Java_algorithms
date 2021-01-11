package String;

public class DemoString1 {

	public static void main(String[]args){
		
		//primitive data type--int, char, boolean, short, byte, ,long, float, double
		//non-primitive data type==user defined
		//class--string, array
		
		//String is immutable--not changeable
		
		String name;
		name="CareerHack";		
		name+=" is an IT Training Center";
		name+=" located at Astoria, New York";
		
		System.out.println(name);
		
		//declare string by creating an object
		
		String city=new String("Astoria");
		city+=",New York";
		System.out.println(city);
		
		String s1;
		String s2;
		String s3;
		s1="New York";
		s2="New York";
		s3="New Jersey";
		
		if(s1==s2)
			System.out.println("Same State");
		else
			System.out.println("Not the Same State");
		
		if(s1.contentEquals(s3))
			System.out.println("Same State");
		else
			System.out.println("Not the Same State");
		
	}
}
