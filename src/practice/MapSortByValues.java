package practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapSortByValues {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "hi");
		map.put(2, "hello");
		map.put(4, "test");
		map.put(3, "abc");
		map.put(5, "xyz");
		
		MapSortByValues mv = new MapSortByValues();
		mv.sortByValue(map);
	}

	public void sortByValue(Map<Integer, String> map){
		
		Comparator<Entry<Integer, String>> byValue = (entry1, entry2) -> entry1.getValue().compareTo(
	            entry2.getValue());

	    Stream<Entry<Integer, String>> val = map
	            .entrySet()
	            .stream()
	            .sorted(byValue);
	    
	    val.forEach((i) -> {
	        System.out.println(i);
	    });
	}
}
