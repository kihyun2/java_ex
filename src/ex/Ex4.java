package ex;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		for (int i = 0; i < 10; i++) {
			System.out.println(rockScissorPaper(name));
		}
	}

	private static String rockScissorPaper(String... name) {
		int randomIndex = (int) (Math.random() * name.length);

		return name[randomIndex];
	}
}
