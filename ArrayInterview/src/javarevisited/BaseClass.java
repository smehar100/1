package javarevisited;

public class BaseClass extends SuperClass {
	private int a=1;
	public BaseClass(){
		super();
		this.a=2;
	}
public BaseClass(int g){System.err.print("sd");
	System.out.printf("sd");
	
	}
	
	public static void main(String args[]){
		
		BaseClass obj= new BaseClass(2);
	
	}

}
