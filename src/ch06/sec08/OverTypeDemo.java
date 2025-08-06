package ch06.sec08;

public class OverTypeDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.name);
		Car c = new Car();
		System.out.println(c.name);

		v.whami();
		v.move();
	}
}
