package ex;

public class Ex14 {
	public static void main(String[] args) {
		Line l1 = new Line(10);
		Line l2 = new Line(20);

		if (0 < l1.compareTo(l2)) {
			System.out.printf("Line [length = %d]이 더 깁니다.\n", l1);
		} else if (0 > l1.compareTo(l2)) {
			System.out.printf("Line [length = %d]이 더 깁니다.\n", l2);
		} else {
			System.out.println("같아요.");
		}

	}
}

class Line implements Comparable {
	int length;

	public Line(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Line l) {
//			return this.length > l.length ? this.length : l.length;
			return this.length - l.length;
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line l) {
			return this.length == l.length;
		}
		return false;
	}
}
