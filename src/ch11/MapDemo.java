package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 2, "포도", 10);
		Map<String, Integer> fruits = new HashMap<String, Integer>(map);

		fruits.put("사과", 3);
		fruits.put("딸기", 3);
		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		System.out.println(fruits.entrySet());
		Set<Map.Entry<String, Integer>> fruitsEntry = fruits.entrySet();
		for (Map.Entry<String, Integer> entry : fruitsEntry) {
			entry.setValue(10);
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}

		System.out.println(fruits.containsKey("사과"));

		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
		Map<String, Integer> fruitsHashTable = new Hashtable<String, Integer>(map);
//		fruitsHashTable.put(null, null); // 널포인터
	}
}
