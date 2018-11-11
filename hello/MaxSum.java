package hello;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaxSum {
	
	
	int a;
	int b;
	
	
	   

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaxSum other = (MaxSum) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public static int findMaxSum(List<Integer> list) {
        Collections.sort(list);
        return (list.get(list.size()-1) + list.get(list.size()-2));
        
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        
        System.out.println(findMaxSum(list));
        System.out.println(1.0/-0.0);
        System.out.println(-1/(1.0/0.0));
        
    }
    
    public void sample(){
    	MaxSum maxSum;
    	maxSum= new MaxSum();
    	try {
			throw new Exception("dsd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		
    	}
    	
    	System.out.println("asdas");
    }
   
}

