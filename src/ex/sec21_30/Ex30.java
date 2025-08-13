package ex.sec21_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 280813 컬렉션 프레임워크
public class Ex30 {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>();

		int input = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			try {
				input = sc.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("0~100까지의 숫만 입력해주세요.");
				sc.nextLine();
				continue;
			}
			if (input < 0) {
				break;
			}
			if (input > 100) {
				System.out.println("점수가 100보다 큽니다.");
				sc.nextLine();
				continue;
			}

			scores.add(input);
		}
		System.out.printf("전체 학생은 %d명이다.\n", scores.size());
		System.out.print("학생들의 성적:");
		int max = 0;
		for (Integer integer : scores) {
			System.out.printf(" %d", integer);
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println();

		char grade = '.';
		for (int i = 0; i < scores.size(); i++) {
			int score = scores.get(i);
			if (score >= (max - 10)) {
				grade = 'A';
			} else if (score >= (max - 20)) {
				grade = 'B';
			} else if (score >= (max - 30)) {
				grade = 'C';
			} else {
				grade = 'F';
			}

			System.out.printf("%d번 학생의 성적은 %d점이며 등급은 %c이다.\n", i, score, grade);
		}
		sc.close();
	}
}
