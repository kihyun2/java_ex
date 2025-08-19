package ex.sec31_40;

import java.util.List;
import java.util.stream.Stream;

// 250819 스트림 문제1
public class Ex34 {
	public static void main(String[] args) {
		List<Integer> scores = List.of(45, 76, 38, 27, 50);
		Stream<Integer> si = scores.stream();
		si.mapToInt(n -> n + 10).forEach(System.out::println);
	}
}
