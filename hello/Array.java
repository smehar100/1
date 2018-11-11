package hello;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class Array {

	
	private static final Logger log = Logger.getLogger(Array.class.getName());
	public static void main(String[] args) {
	
		LinkedHashMap<Integer,String> ql= new LinkedHashMap<Integer,String>();
		ql.put(null, null);
		/*ConcurrentHashMap<Integer,String> lw= new ConcurrentHashMap<Integer,String>();
		lw.put(null, null);
*/		Hashtable<Integer,String> lv= new Hashtable<Integer,String>();
		lv.put(null, null);
		

		int a[]=new int[]{10,1,3,0,9};

		int l= a.length;
		int max= 0;
		for(int i=0;i<l;i++){
			for(int j=i;j<l;j++){
				int res= Math.abs(a[j]-a[i]);
				if(res>max)
					max=res;
			}

		}

		System.out.println(max);
// log.debug("debug mode");
		log.info("information");	
		log.info("information");	
		log.error("dsfsd");
	
	
		
	}

}
