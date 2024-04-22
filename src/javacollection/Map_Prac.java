package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Map_Prac {

	public static void main(String[] args) {
		mapIteration();
	}

	private static void mapIteration() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Australia", "Canbera");
		map.put("New zeeland", "Belington");
		map.put("U.K", "Washington");
		System.out.println(map.get("India"));
		List<String> list = new LinkedList<String>();
		for (Map.Entry<String, String> emap : map.entrySet()) {
			System.out.println(emap.getKey() + "|" + emap.getValue());
			if (emap.getKey().equals("India") || emap.getValue().equals("Australia") || emap.getValue().equals("U.K")) {
				list.add(emap.getValue());
			}
		}
		System.out.println(list);
	}

}
