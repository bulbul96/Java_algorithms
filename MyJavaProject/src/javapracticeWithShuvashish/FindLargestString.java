package javapracticeWithShuvashish;

public class FindLargestString {

	public static String getLongestString(String[] array) {
	    int maxLength = 0;
	    String longestString = null;
	    for (String s : array) {
	      if (s.length() > maxLength) {
	        maxLength = s.length();
	        longestString = s;
	      }
	    }
	    return longestString;
	  }
	 
	  public static void main(String[] args) {
	    String[] strings = {"Bulbul", "Kajol", "Liton", "Subashish"};
	    String longestString = getLongestString(strings);
	 
	    for (int i=0; i<strings.length; i++) {
	      System.out.println(strings[i]);
	    }
	 
	    System.out.println("Longest string: " + longestString);
	  }
	}

