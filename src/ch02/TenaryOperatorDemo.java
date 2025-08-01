package ch02;

public class TenaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y;
		y = (x == 1) ? 10 : 20;
		System.out.println(y);

		int a, b, c;
		a = b = c = 3;

		c = a * b / c % 2;
		System.out.println(c);

		c = a++ + --b * a;
		System.out.println(c);
	}

}
