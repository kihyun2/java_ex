package ex.sec1_10;

public class Ex06 {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");
		circle.show();
		coloredCircle.show();
	}
}

class Circle {
	int radius;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
}

class ColoredCircle extends Circle {
	String color;

	public ColoredCircle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);

	}
}
