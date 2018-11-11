package hello;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    
    	char[] arr= word.toCharArray();
    	int len= arr.length;
    	
    	int i,j;
    	for(i=0,j=len-1;j>=i;i++,j--){
    		
    		if(arr[i]==arr[j]){
    			
    		}
    			
    		else
    			return false;
	
    	}
    	if(j==i||j<i){
			return true;
		}
    	
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("abccba"));
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        
        System.out.println(list);
        
        int arr[]= {2,3,5};
        
        System.out.println(Arrays.toString(arr));       
    }
}