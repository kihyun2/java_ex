package ch05;

public class ArgumentsDemo {
	public static void main(String[] args) {
		System.out.println(args.length);
		// 두번째 인자의 횟수 만큼 첫번째 인자를 콘솔에 출력하도록 프로그램을 하기
		int end = Integer.parseInt(args[1]);
		for (int i = 0; i < end; i++) {
			System.out.println(args[0]);
		}
	}

	public static void increment(String[] args) {

	}
}
