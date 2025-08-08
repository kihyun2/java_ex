package ch09;

public class EntryGenericDemo {
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("홍길동", 20);
		Entry<String, String> e2 = new Entry<>("홍길동", "대한민국");
		Entry<Integer, Integer> e3 = new Entry<>(10, 20);
		Entry<Double, String> e4 = new Entry<>(3.14, "PI");

		System.out.printf("Key: %s, value: %d", e1.getKey(), e1.getValue());
	}
}

class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
