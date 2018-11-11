package hello;

public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        
    	int count=-1;
    	if(items<=0 || ((availableLargePackages*5)+availableSmallPackages)<items)
    		return -1;
    	while(items>=5){
    		if(availableLargePackages>=1){
    			availableLargePackages--;
    			items-=5;
    			count++;
    		}
    		else
    			break;
    			
    	}
    	if(items>=1){
    		while(items!=0){
    			if(availableSmallPackages!=0){
    				availableSmallPackages--;
        			items--;
        			count++;	
    			}
    			else{
    				break;
    			}
    		}
    	}
    	
    	if(count!=-1)
    		return count++;
    	
    	return count;
    	
    }
    
    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10));
    }
}
