package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseHashMap {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("USA", "NY");
		map.put("Canada", "Toronto");
		map.put("Australia","Sydney");
		map.put("Japan", "Tokyo");
		map.put("UK", "London");
		
		
		for(Entry<String, String> entry:map.entrySet()) {
			 System.out.println(entry.getKey()+ " ---> "+ entry.getValue());
		}
		
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		numbers.put(1, 101);
		numbers.put(2, 105);
		numbers.put(3, 108);
		numbers.put(4, 110);
		
		for(Entry<Integer, Integer> entry:numbers.entrySet()) {
			 System.out.println(entry.getKey()+ " ---> "+ entry.getValue());
		}
		
	}

}
