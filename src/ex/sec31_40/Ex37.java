package ex.sec31_40;

import java.util.stream.Stream;

// 250819 스트림 문제 4
public class Ex37 {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		s.sorted().limit(1).forEach(n -> System.out.println(n));
	}
}
