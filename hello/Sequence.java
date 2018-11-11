package hello;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String"); // ABACABA
		String str = sc.next();
		int a = str.length();
		System.out.println("Enter a substring"); // ABA
		String mat = sc.next();
		int b = mat.length();

		boolean find=false;
		int j=0;
		for(int i=0; i<a; i++){

			int set=i;
				while(mat.charAt(j)==(str.charAt(i))){
					j++;
					i++;
					if(j==b){
						System.out.println("The substring matched at"+(set+1));
						find=true;
						break;
				}
					}	
					
					j=0;
					i=set;
			}

	
			if(!find){
				System.out.println("Not found");
			}

	}	
}
