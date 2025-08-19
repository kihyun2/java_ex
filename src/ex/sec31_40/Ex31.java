package ex.sec31_40;

import java.util.HashMap;
import java.util.Map;

// 250814 
public class Ex31 {
	public static void main(String[] args) {
		Map<String, String> data = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
		Map<String, String> animals = new HashMap<String, String>(data);

		System.out.println("변경 전 : " + animals);
		animals.replaceAll((x, y) -> y.toUpperCase());
		System.out.println("변경 후 : " + animals);
	}
}
