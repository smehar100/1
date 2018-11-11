package hello;

public class StaticChecking {
	
	public static int a=10;
	public int b=0;
	
	public static void main(String[] args) {
	

	}
	
	public void method1(){
		method2();
		a=0;
		int u=9;
		b=88;
	}
	public static void method2(){
		method1();
		int a=9;
		//b=3;
		System.out.println(b);
		int n=9;
	}
	
	public static void method2(int ad){
		method1();
		int a=9;
		//b=3;
		System.out.println(b);
		int n=9;
	}
}
