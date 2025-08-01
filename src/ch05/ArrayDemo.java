package ch05;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		// 방법 1
		int[] scores = { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };
//		// 방법 2
//		int[] scores = new int[] { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };
		// 방법 3
//		int[] scores;
//		scores = new int[] { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };
		// 방법 4 (단, 초기화하는 값이 동일할 경우)
//		int[] scores = new int[5];
//		for (int i = 0; i < scores.length; i++) {
//			scores[i] = 90;
//		}

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		System.out.printf("학생 %d명의 점수의 합은: %d\n", scores.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은: %.2f\n", scores.length, sum / (double) scores.length);

		// 배열의 출력
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "Hello";
		System.out.println(Arrays.toString(arr));
		System.out.println(str);

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr);
	}
}
