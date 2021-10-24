package objectclass;

class calci{
	public void add(int i, int j) {
	
	System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		
		System.out.println(i+j+k);
		}
    public void add(double i, double j ) {
		
		System.out.println(i+j);
		}


}
public class Method {
	
public static void main(String args[]) {
	calci obj = new calci();
	obj.add(5 , 2);
	obj.add(5, 6,7);
	obj.add(4.5 , 6.5);
	
	
}
	
}
