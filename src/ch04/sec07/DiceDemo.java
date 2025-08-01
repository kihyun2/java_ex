package ch04.sec07;

import java.util.Scanner;

public class DiceDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("반복수행할 횟수를 입력하세요 : ");
		int count = in.nextInt();
		Dice dice = new Dice();
		for (int i = 0; i < count; i++) {
			dice.roll();
		}
	}
}

class Random {

	public int rolling(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}

class Dice {
	private final Random dice;

	public Dice() {
		this.dice = new Random();
	}

	public void roll() {
		int result = dice.rolling(1, 6);
		System.out.println(result);
	}
}
