package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");
		List<String> car1 = new ArrayList<String>(list);
//		car1.add("산타페");
		System.out.println(car1);

		List<String> car2 = new ArrayList<String>(list);
		car2.remove("제네시스");
		System.out.println(car2);
		System.out.println(car1.containsAll(car2));

		car1.removeIf(c -> c.startsWith("소"));
		System.out.println(car1);

		car1.replaceAll(c -> "New " + c);
		System.out.println(car1);

	}
}
