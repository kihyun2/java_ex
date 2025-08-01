package ch04;

public class CircleDemo {
	public static void main(String[] args) {
		Circle c = new Circle(); // The constructor Circle() is undefined
		c.setRadius(10);
		System.out.println("원의 반지름은 " + c.getRadius());
		System.out.println("원의 넓이는 " + c.findArea());

		Circle c1 = new Circle(2);
		System.out.println("원의 반지름은 " + c.getRadius());
		System.out.println("원의 넓이는 " + c.findArea());

	}
}

//class Circle {
//	double radius; // 자동으로 초기화 되는데 초기값은 0.0
//
//	double findArea() {
//		return 3.14 * radius * radius;
//	}
//}
class Circle {
	// 필드
	private double radius;
//	private double radius1;
//	private double radius2;
//	private double radius3;

	// 생성자
	public Circle() {

	}

	public Circle(double r) {
		if (r > 0) {
			this.radius = r;
		}
	}

//	public Circle(double radius, double radius1, double radius2, double radius3) {
//		if (radius > 0) {
//			this.radius = radius;
//			this.radius1 = radius1;
//			this.radius2 = radius2;
//			this.radius3 = radius3;
//		}
//	}

	// getter
	public double getRadius() {

		return radius;
	}

	// setter
	public void setRadius(double r) {
		this.radius = r;
		if (r <= 0) {
			System.out.println("원의 반지름은 0보다 커야 합니다.");
			return;
		}
	}

	// 멤버(메서드)
	double findArea() {
		return 3.14 * radius * radius;
	}
}