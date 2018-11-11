import java.util.Scanner;

public class FindDuplicateElementsInArray {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int a= sc.nextInt();
		int[] array= new int[a];
		//int[] array2= new int[]{2,3,45,5};
		//int[] array3= {3,3,45,5};
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a;i++)
			array[i]=sc.nextInt();
		
		
		
		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(array[j]==array[i]){		
					System.out.println(array[i]);
					break;
				}
			}
		}
		sc.close();
		
		
	}
	
	
}
