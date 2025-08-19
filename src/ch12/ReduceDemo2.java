package ch12;

import java.util.DoubleSummaryStatistics;

public class ReduceDemo2 {
	public static void main(String[] args) {
		// Nation의 nations를 스트림으로 반환
		// GDP가 20위 이내인 나라들의 인구 총합을 구하라.(단위: 백만명)
		double ns = Nation.nations.stream().filter(n -> n.getGdpRank() <= 20).mapToDouble(n -> n.getPopulation())
				.reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(ns);

		// Nation의 nations를 스트림으로 변환
		// 섬나라에 사는 인구 총합을 구하라. (단위: 백만명)
		DoubleSummaryStatistics ss = Nation.nations.stream().filter(n -> n.isIsland())
				.mapToDouble(n -> n.getPopulation()).summaryStatistics();
		System.out.println(ss);

	}
}
