package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		Set<String> fruits = new HashSet<String>(set);

		fruits.add(null);
		System.out.println(fruits);

		fruits.remove("키위");
		System.out.println(fruits);

		Set<String> fruits2 = new TreeSet<String>(set);

	}
}
