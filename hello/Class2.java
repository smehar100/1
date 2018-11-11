package hello;

public class Class2 {
	
	public static void main(String args[]){
		
		final Class1 obj = new Class1();
		final Class1 obj2 = new Class1();
		
		obj.setA(2);
		obj2.setA(3);
		
		obj=obj2;
	}
}
