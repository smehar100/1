package hello;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class NthMost {

	public static int nthMostRare(int[] elements, int n) {
		 

		
		
		 Map<Integer, Integer> counted = new HashMap<>();
	        for (int i : elements) {
	            if (counted.containsKey(i)) {
	                counted.put(i, counted.get(i) + 1);
	            } else {
	                counted.put(i, 1);
	            }
	        }
	        Map<Integer, Integer> sortedMap =
	                counted.entrySet().stream()
	                           .sorted(Entry.comparingByValue())
	                           .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (k, v) -> k, LinkedHashMap::new));
	        List<Integer> occurrences =
	                sortedMap.entrySet().stream()
	                         .map(Entry::getValue)
	                         .distinct().collect(Collectors.toList());
	        Optional<Integer> answer =
	                sortedMap.entrySet().stream()
	                         .map(Entry::getValue)
	                         .filter(v -> v.intValue() == occurrences.get(n-1)).findFirst();
	        return answer.get();
		
		
	       /* Map<Integer, Integer> map = new HashMap<>();
	        for (int key : elements) {
	            if (map.containsKey(key)) {
	                int occurrence = map.get(key);
	                occurrence++;
	                map.put(key, occurrence);
	            } else {
	                map.put(key, 1);
	            }
	        }

	        for (Integer key : map.keySet()) {
	            int occurrence = map.get(key);
	            if( occurrence==n)
	            	return key;
	            //System.out.println(key + " occur " + occurrence + " time(s).");
	        }
			return n;*/
	    }
    

    public static void main(String[] args) {
        int x = nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }

}
