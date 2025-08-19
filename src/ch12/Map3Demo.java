package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3Demo {
	public static void main(String[] args) {
		List<String> list1 = List.of("안녕 자바!", "잘 가 C++");
		Stream<String> s1 = list1.stream();

		String[] split = "안녕, 자바!".split(" ");
		Stream<String> s2 = Arrays.stream(split);
		s2.forEach(Util::print);
		System.out.println();

		split = "잘 가, C++!".split(" ");
		s2 = Arrays.stream(split);
		s2.forEach(Util::print);
		System.out.println();

		s1 = list1.stream();
		s1.flatMap(s -> Arrays.stream(s.split(" "))).forEach(Util::print);
		System.out.println();

		List<String> list3 = List.of("안녕 자바!", "잘 가 C++", "hello python");
		List<String> list2 = List.of("Good Morning");
		System.out.print("스트림의 요소인 list.size()는 ? ");
		Stream<List<String>> listOf = Stream.of(list2);
		listOf.forEach(l -> System.out.println(l.size()));
		listOf = Stream.of(list1, list2, list3);
		listOf.filter(l -> l.size() > 1).forEach(Util::print);
		System.out.println();

		Stream<List<String>> listOf1 = Stream.of(list1, list2, list3);
		listOf1.flatMap(l -> {
			if (l.size() > 1) {
				return l.stream();
			} else {
				return Stream.empty();
			}
		}).forEach(Util::printWithParenthesis);

	}
}
