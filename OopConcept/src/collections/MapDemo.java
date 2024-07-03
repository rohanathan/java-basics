package collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap Based on Keys
		// Unordered; No Duplicates
		//Passing Generic
		/*
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("Monitor", 32);
		hm.put("Keyboard", "Wireless");
		hm.put("Mouse", "Wireless");
		hm.put("Speakers", "BT");
		hm.put("Ports", 4);
		*/
		Map<String, Object> hm = new HashMap<>(Map.of(
				"Monitor",32,
				"Keyboard","Wireless",
				"Mouse", "Wireless",
				"Speakers","BT",
				"Ports",4
				));
		System.out.println(hm);
		//Iterate HashMap
		//Extract the keys first
		Set<String> keys = hm.keySet();
		//Use get() to get values
		for(String k : keys)
		{
			System.out.println(k + " : "+hm.get(k));
		}

		// LinkedHashMap Based on Keys
		// Ordered; No Duplicates
		LinkedHashMap<String, Object> lhm = new LinkedHashMap<>();
		lhm.put("Monitor", 32);
		lhm.put("Keyboard", "Wireless");
		lhm.put("Mouse", "Wireless");
		lhm.put("Speakers", "BT");
		lhm.put("Ports", 4);
		System.out.println(lhm);

		// TreeMap Based on Keys
		// Sorted; No Duplicates
		TreeMap<String, Object> tm = new TreeMap<>();
		tm.put("Monitor", 32);
		tm.put("Keyboard", "Wireless");
		tm.put("Mouse", "Wireless");
		tm.put("Speakers", "BT");
		tm.put("Ports", 4);
		System.out.println(tm);
		System.out.println(tm.descendingMap());

	}
}
