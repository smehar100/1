package hello;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
    	
    	
    	int length= list.length;
    	for(int i=0;i<length;i++){
    		for(int j=i+1;j<length;j++){
    			if(list[i]+list[j]==sum){
    				int[] array = new int[2];
    				array[0]=i;
    				array[1]=j;
    				return array;
    			}
    		}
    	
    		
    	}
    	
       return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
