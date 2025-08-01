package ch03;

public class whileDemo {
	public static void main(String[] args) {
		// 초기식
		int i = 0;
		int end = 3;
		while (i < end) {

			// 반복 실행문
			System.out.println("loop" + i);
			i++;
		}

		for (int j = 0; j < end; j++) {
			System.out.println("loop" + j);
		}

		int k = 0;
		while (true) {
			System.out.println("loop" + k);
			k++;

			if (k >= end) {
				break;
			}
		}
	}
}
