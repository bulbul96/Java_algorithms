package javapracticeWithShuvashish;

public class HomeWork {

	public static void main(String[] args) {
		
		//find the largest string
		
		int[] numbers= {2, 5, 3, 4, 5, 7, 20, 8, 9, 4, 7 };
		String[] names= {"Bulbul", "Kajol", "Liton", "Subashish"};
		System.out.println(findlargestString(names));
	}

	public static String findlargestString(String[] names) {
		
		String word=names[0];
		for(int i=0; i<names.length; i++) {
			if(names[i].length()>word.length()) {
				word=names[i];
			}
			}
			return word;
		}

	}
