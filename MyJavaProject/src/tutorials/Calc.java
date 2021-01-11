package tutorials;

public class Calc {
	
		int num1;
		int num2;
		int result;//instance variable
		public int num;
		
		public Calc() {
			num1=5;
			num2=4;
			System.out.println("in constructor");
		}
		
		public Calc(double d, int n) {
			num1=(int) d;
			num2=n;
		}
		
		public Calc(double d) {
			// TODO Auto-generated constructor stub
		}

		public int perform(int extra, int prod)   // local variable
		{
			result =(num1+num2+extra)*prod;
			if(result>50)
				return 1;
			else
				return 0;
		}

//public class ObjectDemo

	public static void main(String[]args) {
		Calc obj=new Calc(7.5);//Constructor
		
		//obj.num1=3;
		//obj.num2=5;
		
		//int k=obj.perform(2, 3);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

	public void perform() {
		// TODO Auto-generated method stub
		
	}

}

