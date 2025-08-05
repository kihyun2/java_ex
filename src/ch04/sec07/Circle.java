package ch04.sec07;

public class Circle {
	// 인스턴스 변수
	double radius;
	int numCircles;

	// 정적 변수(static, 클래스)
	static int numOfCircles = 0;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}

}