package hello;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TrainComposition {
    
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void attachWagonFromLeft(int wagonId) {
         deque.add(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
       deque.add(0,wagonId);
    }

    public void showElements(){
    	System.out.println(deque);
    }
    public int detachWagonFromLeft() {
         return deque.remove(deque.size()-1);
    }

    public int detachWagonFromRight() {
       return deque.remove(0);
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        tree.attachWagonFromLeft(9);
        tree.attachWagonFromLeft(2);
        tree.attachWagonFromRight(5);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
        tree.showElements();
        
    }
}