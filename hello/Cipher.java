package hello;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		// Programming question asked in Drishti
		// input nrfzh
		// output quick
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter encrypted text");
		String encrypt=sc.next();
		String decrypt=cipherDecrypting(encrypt);
		System.out.println("The decrypted text is: "+decrypt);
	}

	public static String cipherDecrypting(String str){
		
		int length=str.length();
		Character chr;
		String decrypt="";
		for(int i=0;i<length;i++){
			
			// Main point char is smaller than int can be easily and internally converted without 
			// the need of typecast
			// For Converting int to character add (char) typecast
			if(str.charAt(i)=='x')
				chr='a';
			else if	(str.charAt(i)=='y')
				chr='b';
			else if(str.charAt(i)=='z')
				chr='c';
			else
			chr=(char) (str.charAt(i)+3);
			// For converting character to int no need to typecast
			//int a=(str.charAt(i));
			//System.out.println(a);
			
			decrypt=decrypt+chr;
		}
		return decrypt;
	}
}
