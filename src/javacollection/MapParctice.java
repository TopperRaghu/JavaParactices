package javacollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapParctice {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "Nagpur");
		map.put(2, "Gondia");
		map.put(2, "Amravati");
		map.put(4, "Serrod");
		map.put(5, "Mumbai");
		map.put(5, "Pune");
		System.out.println(map);

		// 1st.
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + "|" + entry.getValue());

		}
		System.out.println("*************************************************");
		for (Map.Entry<Integer, String> elist : map.entrySet()) {

			System.out.println(elist.getKey() + "|" + elist.getValue());
		}
		List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
		list.add(map);
		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(0));
		}

	}

	// Internal working of HashMap
	// Hashing: Uses hashCode() -->Hashcode method coming from object class

}
