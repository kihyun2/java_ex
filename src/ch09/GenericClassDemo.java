package ch09;

import ch06.sec02.Ball;

public class GenericClassDemo {
	public static void main(String[] args) {
		Cup c = new Cup();
		c.setBeverage(new Beer());
		Object o = c.getBeverage();
		Beer b = (Beer) o;
		b.drink();

		Cup c1 = new Cup();
		c1.setBeverage(new Barleytea());
		c1.setBeverage(new Beer());
		c1.setBeverage(new Ball("red"));

		Object o1 = c1.getBeverage();
		if (o1 instanceof Beer b1) {
			b1.drink();
		}
		if (o1 instanceof Barleytea b2) {
			b2.eat();
		}
	}
}
