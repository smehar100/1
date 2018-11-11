package javarevisited;

import java.util.Random;

public class RandomClass {
	
	public static void main(String args[]){
		Random r = new Random();
		
		System.out.println(r.nextInt(1));  // generate number from 0 to 6
		System.out.println(r.nextInt());  // generate any integer number
		System.out.println(r.nextDouble());  // generate any double number
		System.out.println(r.nextBoolean());  // generate any boolean
		
		
	}

}
