package ch05;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner sc = new Scanner(System.in);

		// 배열 선언 : 크기가 100이고 정수를 담고 있는 배열
		int[] scores = new int[100];

		// 표준입력장치에서 원하는 숫자만큼 점수를 입력받아서 배열에 저장, 종료하려면 -1을 입력
		// 입력받은 학생이 몇 명인지 count
		System.out.println("학생들의 점수를 입력하세요 : ");
//		int hasBreak = -1;
//		while (count < 100) {
//			scores[count] = sc.nextInt(); // 이렇게 하면 이스케이프가 배열 한칸 잡아먹네
//			if (scores[count] == hasBreak) {
//				break;
//			}
//			count++;
//		}
//		sc.close();
		int count = 0;
		int score = 0;
		while (count < 100) {
			score = sc.nextInt();
			if (score == -1) {
				break;
			}
			scores[count] = score;
			count++;
		}
		sc.close();

		// 배열에서 count한 학생의 수 만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
//		for (int score : scores) {
//			if (score == hasBreak) {
//				break;
//			}
//			sum += score;
//		}
		for (int i = 0; i < count; i++) {
			sum += scores[i];
		}

		double avg = sum / (double) count;

		System.out.printf("%d명의 합계 점수는 %d이고 평균은 %.2f입니다.\n", count, sum, avg);
	}
}
