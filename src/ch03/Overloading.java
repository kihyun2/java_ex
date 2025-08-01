package ch03;

public class Overloading {
	public static void main(String[] args) {
		int i = 1, j = 10, k = 20;
		System.out.println(max(i, j));
		System.out.println(max(3.4, 4.0));
		System.out.println(max(i, j, k));
		max();

	}

	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public static double max(double x, double y) {
		return (x > y) ? x : y;
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static void max() {
		System.out.println("이얍");
	}

}
