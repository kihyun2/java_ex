package ex.sec31_40;

import java.util.HashMap;
import java.util.Map;

public class Ex33 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = null;
		String minName = null;
		int maxScore = 0;
		int minScore = 100;
		int sum = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (minScore > val) {
				minScore = val;
				minName = key;
			}
			if (maxScore < val) {
				maxScore = val;
				maxName = key;
			}
			sum += val;

		}

		System.out.println("최고 점수: " + maxName + "의 " + maxScore + "점");
		System.out.println("최저 점수: " + minName + "의 " + minScore + "점");
		System.out.printf("평균 점수: %.2f", sum / (double) map.size());
	}
}
