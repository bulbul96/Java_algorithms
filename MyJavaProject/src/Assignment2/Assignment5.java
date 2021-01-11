package Assignment2;

public class Assignment5 {

private void add() {
}
static int sum1;
int x;
int y;
void add(int x, int y) {
	int sum;
	sum=x+y;
	System.out.println(sum);
}
void add(int a, int b, int c) {
	int sum=a+b+c;
	System.out.println(sum);
}
void add(double a, double b, double c) {
	double sum=a+b+c;
	System.out.println(sum);
	
}
public static void main(String[] args) {
	Assignment5 c1=new Assignment5();
	c1.x=10;
	c1.y=15;
	c1.add(10, 15);
	c1.add(10,  15, 20);

	System.out.println(sum1);
}
}
