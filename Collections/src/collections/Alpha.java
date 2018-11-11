package collections;

import java.text.DecimalFormat;

public class Alpha implements Foo {
	String a;
	Alpha(String a){
		this.a=a;
	}
	public static void main(String args[]){
		  double value = 12.00;
				System.out.println(Double.parseDouble(new DecimalFormat("##.####").format(value)));
				
				Alpha obj=new Alpha("jnj");
				//throw new RuntimeException();
				foo();
	}
	public static void foo(){
		throw new RuntimeException();
	}
}
