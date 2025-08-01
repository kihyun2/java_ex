package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner sc = new Scanner(System.in);

		// 배열 선언 : 크기가 100이고 정수를 담고 있는 배열
		ArrayList<Integer> scores = new ArrayList<>();

		// 표준입력장치에서 원하는 숫자만큼 점수를 입력받아서 배열에 저장, 종료하려면 -1을 입력
		// 입력받은 학생이 몇 명인지 count
		System.out.println("학생들의 점수를 입력하세요 : ");
		int score = 0;
		while (true) {
			score = sc.nextInt();
			if (score == -1) {
				break;
			}
			scores.add(score);
		}
		sc.close();

		// 배열에서 count한 학생의 수 만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		// for 사용
		for (int i = scores.size() - 1; i >= 0; i--) {
			if (scores.get(i) <= 50) {
				scores.remove(i--);
				continue;
			}
			sum += scores.get(i);
		}
//		for (int i = 0; i < scores.size(); i++) {
//			System.out.println(scores.get(i));
//			if (scores.get(i) <= 50) {
//				System.out.println(scores.size());
//				scores.remove(i);
//				continue;
//			}
//			sum += scores.get(i);
//		}
		// for-each 사용
//		for (int element : scores) {
//			sum += element;
//		}
		double avg = sum / (double) scores.size();

		System.out.printf("%d명의 합계 점수는 %d이고 평균은 %.2f입니다.\n", scores.size(), sum, avg);
	}
}
