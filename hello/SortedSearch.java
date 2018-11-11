package hello;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
    	
    	if(sortedArray[0]>=lessThan)
    		return 0;
    	int count=0;
    	if(sortedArray[sortedArray.length/2]<lessThan){
    		return sortedArray.length/2;
    	}
    	else{
    	
    	for(int i=sortedArray.length/2;i<sortedArray.length;i++){
    		if(sortedArray[i]<lessThan)
    			count++;
    	}
    	return sortedArray.length/2+count;
    	}
    	
    	
    	
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1,2, 3, 5,6, 7 }, 4));
    }
}
