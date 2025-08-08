package ex.sec21_30;

import java.util.Random;

public class Ex23 {
	public static void main(String[] args) {
		System.out.println(new Dice().roll());
	}
}

class Dice {
	Random r = new Random();

	int roll() {
		return r.nextInt(1, 7);
	}
}
