package ch04.sec07;

public class StaticBlockDemo {
	// 정적(static, 클래스) 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		sumOneToTen = sum;
	}

	// 정적(static, 클래스) 메서드
	public static void main(String[] args) {
		System.out.println(sumOneToTen);
	}
}
