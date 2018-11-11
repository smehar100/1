package hello;

import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ABC {
	
	/*public void method(String a){
		System.out.println("String");
	}*/
	public void method(Object a){
		System.out.println("Object");
	}
	public void method(Integer a){
		System.out.println("Integer");
		
	}
	ABC(){
		System.out.println("Sfsd");
	}
	public static void main(String[] args)  {
		ABC k=new ABC();
		k.method(null);
		
		byte b;
		int a = 9;
		// Compile time error when a = 09
		
		System.out.println(0.0/0.0);
		
		char s='3';
		
		//System.out.println(b);
	//	k.clone();
		
		HashMap obj= new HashMap();
		
		obj.put("a", new Integer(3));
		obj.put("b", new Integer(30));
		obj.put("c", new Integer(300));
		
		System.out.println(obj.get("b"));
		
		HashSet sete= new HashSet();
		
		Arrays.asList(a);
		int a[]= sete.toArray(new int[sete.size()]);
	Collections.synchronizedMap(obj);
	
	Collections.synchronizedSet(sete);
	
	Deque deque = new LinkedList<>();
		String dss="dasa";
		char saa[]=dss.toCharArray();
				
		int sa=2;
		for (int i=0;i<10;i++){
			if(i==2)
				continue;
			else
				System.out.println(i);
		}
		
		throw new NullPointerException();
		
		
	}

}
