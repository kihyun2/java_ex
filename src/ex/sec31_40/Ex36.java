package ex.sec31_40;

import java.util.stream.Stream;

// 250819 스트림 문제3
public class Ex36 {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("갈매기", "나비", "다람쥐", "라마");
		s.filter(n -> n.length() == 2).forEach(n -> System.out.println(n));
	}
}
