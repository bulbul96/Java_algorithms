package tutorials;

public class Emp {
	int eid;
	int salary;
	static String ceo;
	static { //execute when you load a class
		ceo="Larry";
		System.out.println("in static");
	}
 
	public Emp() {  //execute when you create an object
	
		eid=1;
		salary=3000;
		System.out.println("in constructor");
	}
	public void show() {
		System.out.println(eid +":" +salary+ ":" +ceo);
	}
	
	//public static class StaticDemo{
		
	//static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i=9;
		
		
		Emp navin=new Emp();
		navin.eid=8;
		navin.salary=4000;
		Emp.ceo="Mahesh";
		
		Emp rahul=new Emp();
		rahul.eid=9;
		rahul.salary=5000;
		Emp.ceo="Mahesh";//we don't need object here
		
		Emp.ceo="Nikita";
		
		navin.show();
		rahul.show();

	}

}
