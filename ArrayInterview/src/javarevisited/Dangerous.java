package javarevisited;

import java.util.Scanner;

public class Dangerous {
	
	public static void  checkDangerous(String str){
		
		char array[]= str.toCharArray();
		
		int m;
		int i;
		for(i=0;i<str.length()-1;i++){
			m=i;
			if(array[i]=='1'){
				int k=0;
				while(array[i]=='1'){
					
					k++;
					i++;
					if(k==6){
						i=-1;
						System.out.println("YES");
						break;
						
					}
						
				}
			}else{
			
				int k=0;
					while(array[i]=='0'){
						i++;
						
						if(k==6){
							i=-1;
							System.out.println("NO");
							break;
							
						}
							
					}
					
					
				}
			
			if(i==-1){
				break;
			}
			
			i=m;
		}
		if(i==-1){
			System.out.println("kjhk");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		checkDangerous(str);
	}

}
