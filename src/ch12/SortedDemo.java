package ch12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		// 문자열을 스트림으로 변환하고 문자열을 정렬해서 출력하라.
		Stream.of("d", "e", "a", "c", "b").sorted().forEach(Util::print);
		System.out.println();

		// 숫자를 스트림으로 변환하고 숫자를 정렬해서 출력하라.
		Stream.of(3, 5, 1, 7, 9).sorted().forEach(Util::print);
		System.out.println();
		Stream.of(3, 5, 1, 7, 9).sorted((a, b) -> b - a).forEach(Util::print);
		System.out.println();
		// 국가 이름 순서대로 출력하라.
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 GDP Rank(오름차순) 순서대로 출력하라
		Nation.nations.stream().sorted((a, b) -> a.getGdpRank() - b.getGdpRank())
				.map(x -> String.format("%s %d", x.getName(), x.getGdpRank())).forEach(Util::printWithParenthesis);
		System.out.println();
		// 국가별 인구순서대로(내림차순) 출력하라
		Nation.nations.stream().sorted(Comparator.comparing((Nation x) -> x.getPopulation()).reversed())
				.map(x -> String.format("%s %.1f", x.getName(), x.getPopulation())).forEach(Util::printWithParenthesis);
	}
}
