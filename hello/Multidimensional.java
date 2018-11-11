package hello;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {

		int a[][]= new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.println(a[i][j]);
				System.out.println(" ");
			}
			System.out.println("\n");
		}
		sc.close();
	}

}
