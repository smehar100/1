package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListAndVector {

	
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>(2);
		
		System.out.println(list.size());
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		System.out.println(list.size());
		
		
		Vector<Integer> vector = new Vector<Integer>(2);
		
		System.out.println(vector.size());
		
		vector.addElement(18);
		vector.addElement(12);
		vector.add(122);
		
		System.out.println(vector.size());
		System.out.println(vector);
	}
}
