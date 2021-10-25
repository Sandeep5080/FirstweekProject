package ineritance;
class Calculator{
	public int add(int i,int j)
	{
		return i+j;
	}
	
}

public class Inheritancedemo {
	       public static void main(String args[]) {
			Calculator obj = new Calculator();
			int result = obj.add(12,24);
			
			System.out.println(result);
			
			
		}
		
	}
	


