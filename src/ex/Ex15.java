package ex;

public class Ex15 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 2);
		Triangle t2 = new Triangle(1, 3);

		if (!t1.equals(t2)) {
			if (0 < t1.compareTo(t2)) {
				System.out.println(t1.toString() + "이 더 큽니다.");
			} else {
				System.out.println(t2.toString() + "이 더 큽니다.");
			}
		} else {
			System.out.println("두 삼각형은 넓이가 같아요.");

		}
	}
}

class Triangle implements Comparable {
	int width;
	int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	private double area() {
		return (width * height) / 2.0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Triangle t) {
			return (this.area() == t.area()) ? true : false;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Triangle t) {
			return (this.area() < t.area()) ? -1 : 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("삼각형 [width = %d, height = %d, 넓이 = %.1f]", width, height, area());
	}
}