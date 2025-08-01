package ch04.sec06;

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.info();
		Circle c2 = new Circle(10.0);
		c2.info();
		Circle c3 = new Circle("빨강");
		c3.info();
		Circle c4 = new Circle(10.0, "파랑");
		c4.info();

	}
}

class Circle {
	// 필드
	double radius;
	String color;

	// 생성자
	public Circle() {
		this(1.0, "노랑");
		this.radius = 1.0;
		this.color = "노랑";
	}

	public Circle(double radius) {
		this(radius, "노랑");
		this.radius = radius;
	}

	public Circle(String color) {
		this(1.0, color);
		this.color = color;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f이고 색깔은 %s입니다.\n", this.radius, this.color);
	}
}
