package ex.sec31_40;

import java.util.stream.Stream;

// 250819 스트림 문제2
public class Ex35 {
	public static void main(String[] args) {
		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println); // 실행 결과 예상하기
		// 예상 결과 -> 3
		// 출력 결과 -> 3
	}
}
