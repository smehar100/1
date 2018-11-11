package hello;

class Super{
	
	int a= 10;

	void method(){
		System.out.println("Super");

	}
}

class Sub extends Super{

	int b=20;
	void method(){
		System.out.println("Sub");
	}
	
	void method2(int a,int b,int c){
		System.out.println("Sub");
	}

	static void m(){
		
	}

	public static void main(String args[]){
		System.out.println("Integer");
	}
}

class SuperSub{
	
	
	
	public void intValue(Integer a){
		System.out.println("Integer");
		new SuperSub();
	}
	public void intValue(float a){
		System.out.println("long");
	}


	public static void main(String args[]){
		SuperSub obj =  new SuperSub();
		new SuperSub().intValue(2);
		obj.intValue(10);
		Super sup= new Super();
		Sub sub= new Sub();
		sup=sub;
		sup.method();
	}
}