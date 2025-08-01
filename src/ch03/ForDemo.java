package ch03;

import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("출력하고자 하는 구구단을 입력하세요(2~19): ");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, i * dan);
		}

	}
}
