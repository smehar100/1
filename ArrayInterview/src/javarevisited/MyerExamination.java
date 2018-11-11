package javarevisited;

import java.util.Collections;
import java.util.LinkedList;

public class MyerExamination {
	
	
	protected static int calcMinMarks(int a[],int q){
		
		int unique=1;
		for(int i=0;i<q;i++){
			for(int j=i+1;j<q;j++){
				if(a[i]==a[j])
					unique=-1;
			}
		}
		if(unique==1){
			int sum=0;
			for(int i=0;i<q;i++){
				sum+=a[i];
			}
			return sum;
		}
		else{
			LinkedList<Integer> list= new LinkedList<Integer>();
			for(int i=0;i<q;i++){
				list.add(Integer.valueOf(a[i]));
			}
			int yes=-1;
			int newV=0;
			Collections.sort(list);
			for(int i=0;i<q-1;i++){
				if(list.get(i)==list.get(i+1)){
					yes=1;
				}
				if(yes==1){
					newV=list.get(i)+1;
					while(list.contains(newV)){
						
						list.set(i, Integer.valueOf(newV));
						newV=list.get(i)+1;
					}
				}
				yes=0;
				newV=0;
			}
			
			int sum=0;
			for(Integer i:list){
				sum+=i;
			}
			return sum;
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		int a[]={1,3,3,4,5};
		System.out.println(calcMinMarks(a,5));
		int a1[][] = {{1,2},{3,4}};
	}

}
