package hello;

import java.util.Arrays;
import java.util.Scanner;

public class CountAndOrder {

	// Interview Question asked in Dristhi 
	// Input abbadmh
	// Output a2b2d1h1m1
	// Main point toString() or String.valueof() for converting anything to string
	// For converting a string to char array use toCharArray
	// For printing String array ->Arrays.toString(arrayName)
	
	public static void main(String[] args) {
		
		String str3="meharSingh";
		System.out.println(str3.length());
		System.out.println(str3.subSequence(0,str3.length()-1));
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a string");
		String str=sc.nextLine();
		String orderAndNumber=orderAndCount(str);
		System.out.println(orderAndNumber);
	

	}
	
	public static String orderAndCount(String str){
		int length= str.length();
		char ch;
		int j,k=0,m=0;
		int count=1;
		char[] myNameChars = str.toCharArray();
		String[] newArr= new String[length*2];
		for(int i =0;i<length;i++){
			for(j=i+1;j<length;j++){
				if(myNameChars[i]>myNameChars[j]){
					ch=myNameChars[j];
					myNameChars[j]=myNameChars[i];
					myNameChars[i]=ch;
				}
			}
		}
		String outstr="";
		m=0;
		for(m=0;m<length;m++){
			if(m==length-1){
				break;
			}
			if(myNameChars[m]==myNameChars[m+1]  && m<length){
				
				while(myNameChars[m]==myNameChars[m+1] && m<length){
					count++;
					m++;
				}
				outstr=outstr+myNameChars[m]+ String.valueOf(count);
				count=1;
			}
			if(myNameChars[m]!=myNameChars[m+1] && myNameChars[m]!=myNameChars[m-1]){
				
				outstr=outstr+myNameChars[m]+"1";
			}
			
		}
		if(outstr.charAt(outstr.length()-2)==myNameChars[length-1]){
			count=1;
			int o=2;
			while(outstr.charAt(outstr.length()-o)==myNameChars[length-1]){
			count++;	o--;
			}
			outstr=outstr.substring(0, outstr.length()-1)+count;
		}
		else
			outstr=outstr+myNameChars[length-1]+"1";
		
		return outstr;
	}

}
