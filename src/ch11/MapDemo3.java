package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<Fruit, Integer> fruits = new HashMap<>();

		fruits.put(new Fruit("FB"), 3);
		fruits.put(new Fruit("바나나"), 5);
		fruits.put(new Fruit("딸기"), 10);
		fruits.put(new Fruit("Ea"), 5);

		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
	}
}

class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj instanceof Fruit f) {
			return this.hashCode() == f.hashCode();
		}
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
