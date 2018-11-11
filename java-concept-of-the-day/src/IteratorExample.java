import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class IteratorExample {

	public static void main(String args[]){
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		String s1= "av";
		String s2= new String("av");
		String s3 = s2.intern();
		if(s1==s3)
			System.out.println("true");
		Iterator<String> it = myList.iterator();
		
		Locale local = Locale.getDefault();
		System.out.println(local);
		
		while(it.hasNext()){

			String value = it.next();
			
			// Iterator provides remove method Valid
			// If we use list remove method inside this loop it will give ConcurrentModificationException ie on mylist.remove("3")
			// Same case with Enumeration
	
			if(value=="3")
				it.remove();
			else
				System.out.println("List Value:"+value);

		}

		Map<String,String> myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while(it1.hasNext()){
			String key = it1.next();
			System.out.println("Map Value:"+myMap.get(key));
			if(key.equals("2")){
				myMap.put("1","4");
				//myMap.put("4", "4");
			}
		}

	}
}
