package String;

public class BufferString {

	public static void main(String[] args) {
		
		//mutable string--StringBuffer or StringBuilder
		//method available for StringBuffer or StringBuilder
		//append(), insert(), replace(), capacity(), ensureCapacity(), reverse(), delete()
		
		//StringBuffer is thread safe (only one operation happens at a time
		//StringBuilder (java 1.5)is not thread safe (Allows multiple operations at a time)
		
		
		StringBuffer name=new StringBuffer("CareerHack");
		//name.append("CareerHack");
		name.append(" an IT Training Center");
		name.append(" We are located at Astoria");
		
		 System.out.println(name);

		 StringBuilder city=new StringBuilder("New York");
		 city.append(" is in New York");
		 System.out.println(city);
	}

}
