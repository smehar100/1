import java.util.Scanner;

public class FrequentElementInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = sc.nextInt();
		int count,initial=0;
		int freq=-1;
		int[] array = new int[len];
		
		for(int i=0;i<len;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<len;i++){
			count=0;
			for(int j=i+1;j<len;j++){
				if(array[i]==array[j]){
					count++;
					if(initial<count){
						freq=array[i];
						initial=count;
					}
						
					
				}
			}
		} 
		System.out.println(freq);
	}
	
}
