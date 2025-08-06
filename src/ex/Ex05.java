package ex;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// while 문과 Scanner의 nextLine() 메서드를 이요해서 다음 실행 결과와 같이
		// 키보드로부터 입력된 데이터로 예금, 출금, 조회 종료 기능을 제공하는 코드를 작성해보시오.

		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택 > 2
		// 출금액 > 2000
		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택 > 3
		// 잔고 > 8000
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();

		exit: while (true) {
			print();

			int answer = sc.nextInt();

			switch (answer) {
			case 1 -> {
				System.out.printf("예금액> ");
				bankAccount.deposit(sc.nextLong());
			}
			case 2 -> {
				System.out.printf("출금액> ");
				bankAccount.withdraw(sc.nextLong());
			}
			case 3 -> {
				bankAccount.check();
			}
			case 4 -> {
				System.out.println("프로그램 종료");
				break exit;
			}
			default -> System.out.println("잘못된 입력");
			}

		}
		sc.close();

	}

	// print
	static void print() {
		System.out.println("------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료");
		System.out.println("------------------------------------");
		System.out.printf("선택> ");
	}

}

class BankAccount {
	// 잔액
	private long balance;

	// 예금
	public void deposit(long input) {
		System.out.println("예금 처리 완료 ");
		balance += input;
	}

	// 출금
	public void withdraw(long input) {
		if (input > balance) {
			System.out.println("잔액 부족");
			return;
		}
		System.out.println("출금 처리 완료 ");
		balance -= input;
	}

	// 잔고조회
	public void check() {
		System.out.println("잔고> " + balance);
	}

}
