package ch02;

public class ArtithmeticDemo {

	public static void main(String[] args) {

		// long + int = long
		long l = 100L;
		int i = 10;

		long result = l + i;
		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다.\n", l, i, result);

		// double + int = double
		double d = 100.0;
		int i1 = 10;

		double result1 = d + i1;
		System.out.printf("%f 와 %d 의 + 연산 결과는 %f 입니다.\n", d, i1, result1);

		// overflow(int에선 오버플로우 나고 long에선 안 남)
		int a = 1_000_000;
		int b = 2_000_000;

		long res = a * (long) b;
		System.out.printf("%d 와 %d 의 * 연산 결과는 %d 입니다.\n", a, b, res);

		// 1 - 0.1 * 7 = 0.29999998956918716 이렇게 0.3 안나오고 이상한 값 나옴. double, float 특임.
		// 그나마 double이 낫대용
		int apple = 1;
		double pieceUnit = 0.1f;
		int number = 7;

		double result2 = apple - pieceUnit * number;
		System.out.println(result2);

		// 나머지 연산 (0, 0.0로 나누거나 나머지 연산 할 때 예외)
		// 0으로 나눌 때 : java.lang.ArithmeticException: / by zero
		// 0.0으로 나누거나 나머지 연산 할 때 : Infinity, NaN
		double zero = 0.0;
		// double res3 = 5 / zero;
		System.out.println(5 / zero);
		System.out.println(5 % zero);

		int res3 = 4 / 3;
		double res6 = 4 / (double) 3;
		System.out.printf("%d, %f\n", res3, res6);

		// 짝수 홀수 % 연산
		int num1 = 4;
		int res4 = num1 % 2;
		System.out.println(res4);

	}

}
