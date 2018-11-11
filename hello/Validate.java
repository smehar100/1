package hello;

public class Validate {

	public static boolean check(String str){
      
		if(str.length()<=16 && str.length()>=6){
			
		}else{
			return false;
		}
		
		
		int count=0;
		for(int i =0;i<str.length();i++){

			if(str.charAt(i)=='-'){
				count++;
			}
		}
		if(str.charAt(str.length()-1)=='-'){
			return false;
		}
		if(count>1){
			return false;
		}
		if(!Character.isAlphabetic(str.charAt(0))){
			return false;
		}
		String regex="^[a-zA-Z-0-9]*$";
		return(str.matches(regex));
		
		
	}

	public static void main(String[] args) {

		System.out.println(check("MikeStan--98787dish"));
		
	
	}

}
