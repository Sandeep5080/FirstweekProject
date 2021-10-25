package methodoverriding;
class A
{
	public void show()
	{
		System.out.println("comes A");
	}
	class B extends A
	{
	
		@Override
	
	public void show()
	{
		System.out.println("comes B");
	}
	
	

public class Overiding 
{
	public static void main(String args[]) 
	{
		A Obj2 = new A();
		
		
		Obj2.show();
		
	}
	
}}}   



