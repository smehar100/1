package hello;

import java.util.HashSet;
import java.util.Set;

public class Branches {
    public static int count(int[] tree) {

    	Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i<tree.length;i++){
          if(tree[i] != -1)
              set.add(tree[i]);
        }
        return set.size();
    

    }

    public static void main(String[] args) {
        System.out.println(Branches.count(new int[] { 1, 3, 1, -1, 3 }));
    }
}
