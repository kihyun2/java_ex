package ch03;

public class MyMathDemo {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		long a = 2, b = 3;

		System.out.println(math.add(a, b));
		System.out.println(math.sub(a, b));
		System.out.println(math.mult(a, b));
		System.out.println(math.div(a, b));
	}
}
