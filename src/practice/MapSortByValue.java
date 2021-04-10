package practice;
import java.util.HashMap;
import java.util.Map;

public class MapSortByValue {
	
	public void sortMapByValue(HashMap<Integer, String> map) {
		
//		map.entrySet().stream()
//        .sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
//        .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
		
		map.entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByValue())
		  .forEach(System.out::println);
	}
	public static void main(String[] args) {
		MapSortByValue mapSort = new MapSortByValue();
	
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "detroit");
		map.put(2, "dallas");
		map.put(3, "sfo");
		map.put(4, "charlotte");
		mapSort.sortMapByValue(map);
	}

}
