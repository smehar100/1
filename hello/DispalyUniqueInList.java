package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DispalyUniqueInList {

	
	public static void main(String args[]){
		
		
		List<Integer> lst= new ArrayList<Integer>();
		List<Integer> lst2= new ArrayList<Integer>();
	
		lst.add(1);
		lst.add(2);
		lst.add(3);	
		lst.add(4);
		lst.add(1);
		lst.add(1);
		lst.add(3);
		lst.add(6);
		
		
		Collections.sort(lst);
		int count=0;
		for(int i=0;i<lst.size()-1;i++){
			count=-1;
			if(lst.get(i)==lst.get(i+1))
				count=1;
			if(count!=1 && lst.get(i)!=lst.get(i-1))
				lst2.add(lst.get(i));
				
		}
		if(lst.get(lst.size()-1)!=(lst2.get(lst2.size()-1)))
			lst2.add(lst.get(lst.size()-1));
		
		/*
		for(int i=0;i<lst.size()-1;i++){
		
			if(lst.get(i)!=lst.get(i+1)){
				lst2.add(lst.get(i));
			}
			
			else
				i++;
				
		}
		
		if(lst.get(lst.size()-1)!=(lst2.get(lst2.size()-1)))
			lst2.add(lst.get(lst.size()-1));*/
		
		System.out.println(lst2);
		
	}

	
}
