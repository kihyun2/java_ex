package ch04.sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfCircles);
		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c1.numCircles);
		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c2.numCircles);
	}

}
