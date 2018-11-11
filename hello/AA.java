package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AA extends Abs {
	
	public static int al;
public int aqp=0;

public static strictfp float method(){
	return (float) 4.5;
}
public  strictfp float method7(){
	as=99;
	return (float) 4.5;
}
	public static void main(String[] args) {
		StaticChecking.a=8;
		
		
		int x = 10;  
		int ey = 20;  
		ey = (x + ey) - (x = ey);  
		System.out.println("X = " + x + "; Y = " + ey); 
		
		System.out.println((2000%4==0)?"Leap":"Not");
		int result= (x>ey)?2:1;
		
		System.out.println(result);
		
		AA dsds = new AA();
		System.out.println(dsds instanceof AA);
		List<Integer> list=new ArrayList<>(); 
		method();
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		Map<Integer,String> map2 = new ConcurrentHashMap<Integer,String>();
		
		System.out.println(Math.abs(-211));
		String s= "mehar";
		System.out.println(s.concat("sdsa"));
		String add="324234";
		System.out.println(Integer.valueOf(add));
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(2);
		ll.add(26);
		ll.add(24);
		
		ll.forEach(i->{
			
		});
		
		System.out.println(ll);
		int[] adda= new int[]{1,3,4};
		System.out.println(Arrays.toString(adda));
	// Autoboxing
	int aq=10;
	Integer ine= new Integer(10);
	
	//Unboxing
	int y= ine;
		
		String str1="abp";
		String str2="abp";
		String str3= new String();
		str3="abp";
		String str4= new String("abp");
		
		StringBuilder sBuild=new StringBuilder(str1);
		sBuild.append("sadad");
		System.out.println(sBuild);
		
		str2= str2+sBuild;
	
		if(str1.equals(str2))
			System.out.println("True");
		if(str1==(str2))
			System.out.println("True");
		
		/*if(str3.equals(str4))
			System.out.println("True");*/
		if(str3==(str2))
			System.out.println("True");
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int a=list.size();
		int i=0;
		while(i!=a){
			
			System.out.println(list.get(i));
			i++;
		}

	}
	@Override
	void ab(int a) {
		as=99;
		
	}

}
