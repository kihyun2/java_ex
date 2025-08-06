package ch06.sec08;

public class Vehicle {
	String name = "탈 것";

	void whami() {
		System.out.println("나는 탈 것이다.");
	}

	static void move() {
		System.out.println("이동하다.");
	}
}

class Car extends Vehicle {
	String name = "자동차";

	@Override
	void whami() {
		System.out.println("나는 자동차이다.");
	}

	static void move() {
		System.out.println("달리다.");
	}
}
