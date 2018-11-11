package hello;

public class OrderOfPrecedence {

	public static void main(String[] args) {
		
		int result1= 72/12/3;
		System.out.println(result1);
		
		int result2= 1+2*4;
		System.out.println(result2);
		int d4 =0;
		final  int k= 4;
		ContainsEnum.Season s= ContainsEnum.Season.RAINY;
		System.out.println(s.value);
		
		int x=5;
		int y=10;
		y=(x+y)-(x=y);
		int result3= x=y*10;
		System.out.println(result3);
		 int a=20;
		//    a= a++ + 1;
		 int h= x+++a;
		    System.out.println(a);
		    System.out.println(h);
	}

}
