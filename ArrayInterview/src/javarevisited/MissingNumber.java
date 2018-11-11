package javarevisited;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int find[]={1,2,3,5,4};
		int duplicate[]={2,4,5,6,2,3,4};
		//findMissing(find);
		duplicate(duplicate);
		

	}
	public static void findMissing(int a[]){
		int len= a.length;
		int sum=((len+1)*(len+2))/2;
		for(int i=0;i<len;i++){
			sum-=a[i];
		}
		System.out.println(sum);
	}
	public static void duplicate(int a[]){
			
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(35);
		list.add(4);
		list.add(3);
		list.add(42);
		list.add(31);
		
		int as=list.size();
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.addAll(list);
		System.out.println(set2);
		for(int i=0;i<as;i++){
			if(!set.add(list.get(i))){
				System.out.println(list.get(i));
			}
			
		}
		ArrayList list2 = new ArrayList(Arrays.asList(a));
		System.out.println("&&&&&&&&&");
		for(int i=0;i<list2.size();i++){
			if(!set2.add((Integer) list2.get(i))){
				System.out.println(list2.get(i));
			}
			
		}
		
	}

}
