package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collect {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		
		
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		
		Collections.reverse(list);
		
//		Iterator<Integer> i = list.iterator();
//		
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
//		
		for (Integer object : list) {
			System.out.println(object);
		}
		
		
		/*int a= list.size();
		
		System.out.println("the size of list is"+a);
		
		for(int x=a-1;x>=0;x--){
			System.out.println(list.get(x));
		}*/
		
		Integer arr[]= new Integer[5];
		arr[0]=2;
		arr[4]=2;
		
		list=Arrays.asList(arr);
		

	}

}
