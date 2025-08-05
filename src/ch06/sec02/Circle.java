package ch06.sec02;

public class Circle {
	private int radius;

	public static void staticMethod() {

	}

	public final void findT() {
		System.out.println("넓이는 (π * 반지름 * 반지름)이다.");
	}

	private void secret() {
		System.out.println("비밀이다.");
	}

	public void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}

	void findArea() {
		System.out.println("넓이는 (π * 반지름 * 반지름)이다.");
	}

}
