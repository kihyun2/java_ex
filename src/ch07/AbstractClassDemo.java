package ch07;

public class AbstractClassDemo {
	public static void main(String[] args) {
	}
}

abstract class Shape {
	double pi = 3.14;

	abstract void draw();

	public double findArea() {
		return pi * 1;
	}

}
