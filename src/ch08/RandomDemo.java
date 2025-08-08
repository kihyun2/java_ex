package ch08;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i < 7; i++) {
			System.out.print(r.nextLong(2000000000087l) + " ");
		}

	}
}
