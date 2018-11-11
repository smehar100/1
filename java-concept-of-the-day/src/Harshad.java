import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number1= sc.nextInt();
		int number2=number1,x,y,sum=0;
		while(number2!=0){
			x=number2%10;
			sum+=x;
			number2/=10;
		}
		
	String a=((number1%sum)==0)?"Harshad Number":"Not a Harshad Number";
		System.out.println(a);
		
		
	}

}
