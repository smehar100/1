package hello;

public class RemoveRepetitions {
    public static String transform(String input) {
      String str="";
    	for(int i= 0; i<input.length()-1; i++){
    		if(input.charAt(i)!=input.charAt(i+1)){
    			str+=input.charAt(i);
    		}
    		else{
    			int a =0;
    			while(input.charAt(i)==(input.charAt(i+1))){
    				if(a==0){
    					str+=input.charAt(i);
    					a=1;
    				}
    				if(i==input.length())
    					break;
    				i++;
    			}
    		}
    	}
    	return str;
    	
    }
    
    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));        
    }
}
