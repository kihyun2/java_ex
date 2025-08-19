package ex.sec21_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex26 {
	// 요구사항: 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.(비밀번호는 숫자 4자리로만 입력해야 함)
	// 계좌 번호 유일해야함(set으로 하면 좋은데 어떻게 하면 될까요)
	// 2. 예금은 금액제한 없음(입금시 계좌번호만 알면 입금할 수 있음)
	// 3. 잔고보다 큰 금액은 인출할 수 없음(출금시 계좌번호와 비밀번호가 일치해야만 인출 할 수 있음)
	// 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음(비밀번호는 계좌번호, 이름, 기존비밀번호가 일치하는 경우에만 변경할 수
	// 있음)

	private Map<String, Account> acMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex26 ex = new Ex26();

		String order = "";
		while (true) {
			print("print_menu");
			order = in.nextLine();
			if (order.equals("6")) {
				System.out.println("프로그램 종료");
				break;
			}
			switch (order) {
			case "1" -> {
				print(order);
				ex.create(in);
			}
			case "2" -> {
				print(order);
				ex.viewAccountList();
			}
			case "3" -> {
				print(order);
				ex.deposit(in);
			}
			case "4" -> {
				print(order);
				ex.withdraw(in);
			}
			case "5" -> {
				print(order);
				ex.changePassword(in);
			}
			default -> System.out.println("이상한 거 쓰지 마세요(1-6까지 숫자 쓰세요)");

			}
		}
		in.close();
	}

	// 계좌 생성
	private void create(Scanner in) {

		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();
		System.out.print("계좌주: ");
		String accountOwner = in.nextLine();
		System.out.println("비밀번호(4자리 숫자): ");
		String password = in.nextLine();
		System.out.print("초기입금액: ");
		long balance = in.nextLong();
		in.nextLine();

		boolean isPossible = true;
		if (hasAccountNo(accountNo)) {
			System.out.println("결과: 실패(이미 있는 계좌번호입니다.)");
			isPossible = false;
		}
		if (!checkPassword(password)) {
			System.out.println("결과: 실패(패스워드는 4자리 숫자여야 합니다.)");
			isPossible = false;
		}
		if (balance < 0) {
			System.out.println("결과: 실패(초기 금액이 0보다 커야 합니다.)");
			isPossible = false;
		}

		if (isPossible) {
			acMap.put(accountNo, new Account(accountNo, accountOwner, balance, password));
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
	}

	// 계좌 목록
	private void viewAccountList() {
		for (Map.Entry<String, Account> entry : acMap.entrySet()) {
			System.out.println(entry.getValue());

		}
	}

	// 계좌 목록에 계좌 번호 중복 확인
	private boolean hasAccountNo(String accountNo) {
		return acMap.containsKey(accountNo);
	}

	// 예금
	private void deposit(Scanner in) {
		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();
		System.out.print("예금액: ");
		long balance = in.nextLong();
		in.nextLine();

		if (acMap.containsKey(accountNo)) {
			acMap.get(accountNo).deposit(balance);
			System.out.println("결과: 예금 성공했습니다.");
		} else {
			System.out.println("결과: 예금 실패했습니다.");
		}

	}

	// 출금
	private void withdraw(Scanner in) {
		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();
		System.out.print("비밀번호: ");
		String password = in.nextLine();
		System.out.print("출금액: ");
		long balance = in.nextLong();
		in.nextLine();

		if (acMap.containsKey(accountNo)) {
			Account account = acMap.get(accountNo);
			if (account.getPassword().equals(password) && account.getBalance() >= balance) {
				account.withdraw(balance);
				System.out.println("결과: 출금 성공했습니다.");

			}
		} else {
			System.out.println("결과: 출금 실패했습니다.");
		}

	}

	// 비밀번호 변경
	private void changePassword(Scanner in) {
		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();
		System.out.print("계좌주: ");
		String accountOwner = in.nextLine();
		System.out.println("기존 비밀번호: ");
		String oldPassword = in.nextLine();
		System.out.println("새 비밀번호: ");
		String newPassword = in.nextLine();

		if (acMap.containsKey(accountNo)) {
			Account account = acMap.get(accountNo);
			if (account.getAccountOwner().equals(accountOwner) && account.getPassword().equals(oldPassword)) {
				if (!checkPassword(newPassword)) {
					System.out.println("결과: 실패(패스워드는 4자리 숫자여야 합니다.)");
					return;
				}
				account.setPassword(newPassword);
				System.out.println("결과: 비밀번호 변경 성공");
				return;
			}

		} else {
			System.out.println("결과: 실패(해당 계좌번호는 존재하지 않습니다.)");
		}
		System.out.println("결과: 실패(계좌주와 비밀번호가 맞지 않습니다.)");
	}

	// 비밀번호 조건 확인(비밀번호 해도 되면 true 아니면 false)
	private static boolean checkPassword(String password) {
		if (password.length() == 4 && password.matches("\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	// 각종 print
	private static void print(String order) {
		if (order == "print_menu") {
			String s = """
					----------------------------------------------------------------
					1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 비밀번호 변경 | 6. 종료
					----------------------------------------------------------------
					선택 >""";
			System.out.print(s);
		} else if (order.equals("1")) {
			String s = """
					---------
					계좌생성
					---------
					""";
			System.out.println(s);
		} else if (order.equals("2")) {
			String s = """
					---------
					계좌목록
					---------
					""";
			System.out.println(s);
		} else if (order.equals("3")) {
			String s = """
					---------
					예금
					---------
					""";
			System.out.println(s);
		} else if (order.equals("4")) {
			String s = """
					---------
					출금
					---------
					""";
			System.out.println(s);
		} else if (order.equals("5")) {
			String s = """
					---------
					비밀번호변경
					---------
					""";
			System.out.println(s);
		}
	}
}

class Account {
	private String accountNo;
	private String accountOwner;
	private long balance;
	private String password;

	// 생성자
	public Account(String accountNo, String accountOwner, long balance, String password) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.password = password;
	}

	// 접근자

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 메서드
	// 입금
	public void deposit(long balance) {
		this.balance += balance;
	}

	// 출금
	public void withdraw(long balance) {
		this.balance -= balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s \t %d", accountNo, accountOwner, balance);
	}

}
