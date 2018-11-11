package hello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConcreteClass implements Runnable,Interf {

	
	public void sum() {
		System.out.println("Hello from subclass");
		//TODO 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.forEach(i->{
			
		});
		
		
		
	}
	
	public static void main(String args[]){
		Queue<Integer> que = new LinkedList<Integer>();
		
		//System.out.println(que.element());
		System.out.println(que.peek());
		//System.out.println(que.remove());
		System.out.println(que.poll());
		return;
		
	}

}
