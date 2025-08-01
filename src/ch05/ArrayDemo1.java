package ch05;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner sc = new Scanner(System.in);

		// 배열 선언 : 크기가 5이고 정수를 담고 있는 배열
		int[] scores = new int[5];

		// 표준입력장치에서 5번 점수를 입력받아서 배열에 저장
		System.out.println("학생 5명의 점수를 입력하세요 : ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		sc.close();

		// 배열에서 5번 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double avg = sum / (double) scores.length;

		System.out.printf("%d명의 합계 점수는 %d이고 평균은 %.2f입니다.\n", scores.length, sum, avg);
	}
}
