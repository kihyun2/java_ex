package ch12;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
	public static void main(String[] args) {
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);

		boolean allMatch = IntStream.of(10, 20, 30).allMatch(n -> n % 10 == 0);
		System.out.println(allMatch);

		// 모든 국가의 인구수가 1억이 넘는다.
		boolean isMatch = Nation.nations.stream().allMatch(n -> n.getPopulation() > 100);
		System.out.println(isMatch);

		// 모든 국가가 섬은 아니다. // true
		boolean isMatch1 = Nation.nations.stream().anyMatch(n -> n.isIsland());
		System.out.println(isMatch1);

		// 모든 국가의 이름은 일본이 아니다. // true
		boolean isMatch2 = Nation.nations.stream().noneMatch(n -> n.getName().equals("Japan"));
		System.out.println(isMatch1);

		System.out.println("-----------------------------");
		// 국가 리스트 중에서 섬인 나라중에 가장 처음에 찾은 나라를 출력
		Optional<Nation> findSome1 = Nation.nations.stream().filter(n -> n.isIsland()).findFirst();
		findSome1.ifPresentOrElse(Util::print, () -> System.out.println("섬인 나라가 없음"));
		System.out.println();

		// 국가 리스트 중에서 섬이 아닌 나라 중에 아무나라나 찾아서 출력
		Optional<Nation> findSome2 = Nation.nations.stream().filter(n -> !n.isIsland()).findAny();
		findSome2.ifPresentOrElse(Util::print, () -> System.out.println("섬이 아닌 나라가 없음"));
		System.out.println();

		// 인구수 10억이 넘고 GDP가 가장 높은 나라를 찾아서 출력
		Optional<Nation> findSome3 = Nation.nations.stream().filter(n -> n.getPopulation() > 1000)
				.sorted((a, b) -> b.getGdpRank() - a.getGdpRank()).findFirst();
		findSome3.ifPresentOrElse(Util::print, () -> System.out.println("인구가 10억이 넘는 나라가 없음."));
		System.out.println();
	}
}
