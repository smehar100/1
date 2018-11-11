package javarevisited;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MathMethod  implements Inter{
	static int ra=9;
	
	public void methodB(){
	System.out.println(ifsdf);
	}
	
	static{
		ra=0;
		int a=0;
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		
		
		System.out.println(Math.round(123231231.12));
		System.out.println(ifsdf);
		double d=-27.2345;
		
		
		System.out.println(Math.ceil(d));
		System.out.println(Math.round(d));
		System.out.println(Math.abs(d));
		System.out.println(Math.floor(d));
		
		long l= 78l;
		System.out.println(l);
		
		Long obj=9L;
		System.out.println(obj);
		
		Float f=89.08F;
		System.out.println(f);
		
		
	/*	Set setOne=new TreeSet();
		
		setOne.add(1);
		setOne.add("2");
		setOne.add(3);
		//System.out.println(setOne);
		 * 
		 * 
*/		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		String str1= new String("mehar");
		String str2= new String("mehardd");
		
		str1=str2;
		
		if(str1==str2)
			System.out.println("EQUAL");
		
		 
		// Object x = new Integer(0);
	   //  System.out.println((String)x);
	     
	     
		map.put(1, 1);
		map.put(1, 10);
		map.put(2, 1);
		
		System.out.println(map);
		
	
		int a[] = new int[2];
		
		int b[]={2,45,2};
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(1);
		list.add(14);
		list.add(1);list.add(13);list.add(2);
		list.add(31);list.add(163);list.add(2);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		
		System.out.println(set);
		
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.synchronizedCollection(list);
		Integer ea[] = list.toArray(new Integer [(list.size())]);
		Integer i[] = new Integer[10];
		Integer aass= 7;
		int rt=90;
		Integer ioo=rt;

		Integer aasews= new Integer(7);
		
		int hnb= (int)aasews;
		
	long pl= rt;
	
	long ui=9090;
	
	BigInteger bigBoss =  new BigInteger("2344323323432312312");
	System.out.println(bigBoss);
	int ssa= (int)ui;
	
	boolean [] test = new boolean[3];
	System.out.println(test[1]);
	
	Integer[] arrayww = new Integer[3];
	
	for(int e=0;true;ui++){
		
	}
	
/*	for(int wi=0;;wi++){
		
	}*/
	
		
		/*for(;;){
			
		}
		*/
		

	}
	
	public static<T>   void convertToArray(T i[]){
		
		
	}
		public int method(){
			return 0 ;
		}
}
