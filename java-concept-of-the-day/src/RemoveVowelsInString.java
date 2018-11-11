import java.util.Scanner;

public class RemoveVowelsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		removeVowel(str);

	}
	public static void removeVowel(String str){
		StringBuilder sb= new StringBuilder();
		int len=str.length();
		for(int i=0;i<len;i++){
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o'
					&& str.charAt(i)!='u'){
				sb.append(str.charAt(i));			
			}
		}
		System.out.println(sb);
	}

}
