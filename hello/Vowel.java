package hello;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");
		String str1=sc.next();
		System.out.println("Enter a word of same or different type");
		String str2=sc.next(); 

		int result= check(str1,str2);

		if(result==1)
			System.out.println("The two word are same");
		else if(result==0)
			System.out.println("Both words are of same type");
		else
			System.out.println("Not Identical");
	}
	public static int check(String str1,String str2){

		if(str1.equals(str2))
			return 1;

		int length1=str1.length();
		int length2=str2.length();
		int j=0,i=0;
		int x=0,y=0;


		while(i<length1){
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'
					||str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'){
				if(str2.charAt(j)=='a'||str2.charAt(j)=='e'||str2.charAt(j)=='i'||str2.charAt(j)=='o'||str2.charAt(j)=='u'
						||str2.charAt(j)=='A'||str2.charAt(j)=='E'||str2.charAt(j)=='I'||str2.charAt(j)=='O'||str2.charAt(j)=='U'){
					x=i;y=j;
					
				}else{
//					if(str1.subSequence(i+1, length1).equals(str2.substring(j, length2))){
//						return 0;
//					}
					i++;
					if(i==length1){
						return -1;
					}
					while(i<length1){
						if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'
								||str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'){
							if(str2.charAt(j)=='a'||str2.charAt(j)=='e'||str2.charAt(j)=='i'||str2.charAt(j)=='o'||str2.charAt(j)=='u'
									||str2.charAt(j)=='A'||str2.charAt(j)=='E'||str2.charAt(j)=='I'||str2.charAt(j)=='O'||str2.charAt(j)=='U'){
								
								
							}
							else{
								return -1;
							}
						}
						else{
							if(str1.charAt(i)!=str2.charAt(j)){
								return -1;
							}
						}
						i++;j++;
						
//						if(j==length2 && str1.charAt(i-1)!='a' && str1.charAt(i-1)!='e'&& str1.charAt(i-1)!='i' && str1.charAt(i-1)!='o' && str1.charAt(i-1)!='u'
//								&& str1.charAt(i-1)!='A' && str1.charAt(i-1)!='E' && str1.charAt(i-1)!='I' && str1.charAt(i-1)!='O' && str1.charAt(i-1)!='U')
//							return -1;
						if(j==length2)
							return 0;
						if(i==length1&&j==length2)
							return 0;
						
					}
					i=x;j=y;
				}
					
			}
			else{
				if(str1.charAt(i)!=str2.charAt(j)){
					return -1;
				}
			}
			
			i++;j++;
/*			if(j==length2 && str1.charAt(i)!='a' && str1.charAt(i)!='e'&& str1.charAt(i)!='i' && str1.charAt(i)!='o' && str1.charAt(i)!='u'
					&& str1.charAt(i)!='A' && str1.charAt(i)!='E' && str1.charAt(i)!='I' && str1.charAt(i)!='O' && str1.charAt(i)!='U')
				return -1;
*/			if(j==length2)
				return 0;
			if(i==length1&&j==length2)
				return 0;
			
		}
		
		return -1;
		
	}

}
