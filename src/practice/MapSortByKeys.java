package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("hi", "whats up");
		map.put("abc", "how are you");
		map.put("test", "verify");
		
		MapSortByKeys mk = new MapSortByKeys();
		mk.sortByKey(map);
	}
	
	public void sortByKey(Map<String, String> map){
		Map<String, String> tmap = new TreeMap<String, String>(map);
		for(Map.Entry<String, String> entry: tmap.entrySet()){
			System.out.println("Key-->"+entry.getKey()+"--value-->"+entry.getValue());
		}
	}

}
