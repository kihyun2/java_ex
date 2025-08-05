package ch06.sec02;

public class InheritanceDemo {
	public static void main(String[] args) {

		Circle.staticMethod();

		Circle c = new Circle();
		Ball b = new Ball("빨간색");

		System.out.println("원 :");
		c.findRadius();
		c.findArea();

		System.out.println("\n공 :");
		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();

		// 오버리이딩 불가
		// 1) private은 오버라이딩 대상이 아님.
		// 2) static 메서드는 오버라이딩 대상이 아님.
		// 3) final 메서드는 더이상 수정 불가, 자식 클래스가 오버라이딩 못함.
	}
}
