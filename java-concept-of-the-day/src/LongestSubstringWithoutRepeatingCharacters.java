import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		char[] array=str.toCharArray();
		int len=1;
		StringBuilder sb= new StringBuilder();
		
		
		for(int i=0;i<str.length();i++){
			if(i==str.length())
				break;
			if(array[i]!=array[i++]){
				len++;
				sb.append(array[i]);
				
			}
			else{
				len=1;
				sb= new StringBuilder();
			}
				
		}
		String str2=sb.toString();
		for(int i=0;i<str2.length();i++){
			if(array[str.length()-1]==str2.charAt(i)){
				len=1;
				sb= new StringBuilder();
			}
		}
		System.out.println(sb);
		
		sc.close();
	}

}
