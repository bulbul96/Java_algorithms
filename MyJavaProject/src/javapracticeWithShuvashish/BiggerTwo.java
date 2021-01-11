package javapracticeWithShuvashish;

public class BiggerTwo {



		
		//find the number of same character in the array
		
		public static void main(String[] args) {
			int[] numbers= {2, 5, 3, 4, 5, 7, 20, 8, 9, 4, 7 };
			String names[]= {"Bulbul", "Kajol", "Liton", "Subashish"};

			int total=0;
			int checkNumber=3;
			char checkChar='o';
			
			
			for(int i=0; i<names.length; i++) {
				for(int j=0; j<names[i].length(); j++) {
					if(names[i].charAt(j)==checkChar)
				
					total=total+1;
				}
				
			}

			//
			
			for(String name: names) {
				for(int i=0; i<name.length(); i++) {
					if(name.charAt(i)==checkChar) {
						total=total+1;
					}
				}
			}System.out.println(total);
	}			
			public int[] biggerTwo(int[] a, int[] b) {
				int totalA=a[0]+a[1];
				int totalB=b[0]+b[1];
				if(totalA>=totalB) {
					return a;
				}else
				return b;
				}
			}

			

