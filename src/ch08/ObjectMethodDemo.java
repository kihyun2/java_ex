package ch08;

import java.util.Objects;

public class ObjectMethodDemo {
	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech", 2000);
		Mouse m2 = new Mouse("Logitech", 2000);
		Mouse m3 = m1;

		Keyboard k1 = new Keyboard("Microsoft", 100);
		Keyboard k2 = new Keyboard("Microsoft", 100);

		System.out.println(m1.toString());
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		System.out.println(k1.toString());
		System.out.println(k1);
		System.out.println(k2);

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));

	}
}

class Mouse {
	String name;
	int price;

	public Mouse(String name) {
		this.name = name;
	}

	public Mouse(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Mouse m) {
				return this.hashCode() == m.hashCode();
//				if (name.equals(m.name) && this.price == m.price) {
//					return true;
//				}
//				return false;
//			}
			}
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}

class Keyboard {
	String name;
	int price;

	public Keyboard(String name) {
		this.name = name;
	}

	public Keyboard(String name, int price) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Keyboard k) {
				return this.hashCode() == k.hashCode();
//				if (name.equals(m.name) && this.price == m.price) {
//					return true;
//				}
//				return false;
//			}
			}
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}
