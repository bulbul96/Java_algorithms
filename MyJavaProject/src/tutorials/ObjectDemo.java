package tutorials;


public class ObjectDemo {
	
	//Class Calc
	//{
		int num1;
		int num2;
		int result;
		void perform() {
			result=num1+num2;
		}
	//}

	public static void main(String[] args) {
		
		Calc obj=new Calc(); //knows something and does something
		
		obj.num1=3;
		obj.num=5;
		
		obj.perform();
		
		System.out.println(obj.result);
	
		
	}

}
