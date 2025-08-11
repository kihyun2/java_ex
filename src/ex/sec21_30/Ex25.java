package ex.sec21_30;

public class Ex25 {
	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };

		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		for (double[] d : interests) {
			// sum1의 0번째 자리를 계속 초기화 하면서 합계로 계속 재사용하기
			sum1[0] = 0;
			for (double e : d) {
				sum1[0] += e;
			}
			// sum1의 2번째 자리를 로우 인덱스 + 1로 사용
			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", (int) ++sum1[2], sum1[0] / d.length);
			sum1[1] += sum1[0];
		}
		System.out.printf("%d년간 평균 이자율 = %.2f%%\n", (int) sum1[2], sum1[1] / sum1[2]);

	}

}
