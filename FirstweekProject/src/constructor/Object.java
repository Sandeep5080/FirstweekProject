package constructor;

class Calc {
	int num1;
	int num2;
	int result;
	
	public Calc()
	{
		num1 = 4;
		num2 = 3;
		
	}
	public Calc(int a)
	{
		num1 = a;
		num2 = a;
		
	}
	public Calc(double a)
	{
		num1 =(int) a;
		num2 =(int) a;
		
	}
}
public class Object {
	public static void main(String args[]) {
		Calc obj = new Calc(33.66);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);

		
	}
	
}

	


