package ch12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	public static void main(String[] args) {
		Stream<Nation> ns = Nation.nations.stream();
		Double collect = ns.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		System.out.println("인구 평균:" + collect);

		ns = Nation.nations.stream();
		Long collect2 = ns.collect(Collectors.counting());
		System.out.println("나라 개수:" + collect2);

		// 4개의 나라를 추출해서 '-'로 나라이름을 연결해서 String으로 반환(joining)
		ns = Nation.nations.stream();
		String s = ns.limit(4).map(n -> n.getName()).collect(Collectors.joining("-"));
		System.out.println(s);

		// 4개의 나라를 추출해서 '+'로 나라이름을 연결해서 String으로 반환(mapping)
		ns = Nation.nations.stream();
		s = ns.limit(4).collect(Collectors.mapping(n -> n.getName(), Collectors.joining("+")));
		System.out.println(s);

		// 인구수가 가장 많은 나라의 인구수를 출력하기(collect(Collectors.maxBy()))
//		List<Nation> ls = List.of();
		ns = Nation.nations.stream();
		Optional<Double> d = ns.map(n -> n.getPopulation()).collect(Collectors.maxBy((a, b) -> Double.compare(a, b)));
		d.ifPresentOrElse(Util::print, () -> System.out.println("아무것도 없어요"));
//		System.out.println(d.get());

	}
}
