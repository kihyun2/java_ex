package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach(System.out::println); // Consumer 인터페이스의 구현체를 람다식으로 작성
		list.removeIf((s) -> s == null || s.length() == 0);
		list.forEach(System.out::println); // Consumer 인터페이스의 구현체를 람다식으로 작성

		// 숫자를 원소로 가지는 ArrrayList를 작성하라. 그리고 원소를 4개 추가하는데 + : 2개 -: 2개
		// 리스트에서 음수값은 삭제하고 양수값만 남겨놓은 다음, 남아있는 원소를 전부 출력해주세요.
		ArrayList<Integer> iArr = new ArrayList<Integer>();
		iArr.add(2);
		iArr.add(4);
		iArr.add(-2);
		iArr.add(-5);
		System.out.printf("삭제 전: ");
		iArr.forEach((i) -> System.out.printf(i + " "));
		System.out.println();

		iArr.removeIf((i) -> i < 0);

		System.out.printf("삭제 후: ");
		iArr.forEach((i) -> System.out.printf(i + " "));
		System.out.println();
		// 객체(삼각형)을 원소로 가지는 ArrayList를 작성하라. 원소를 3개 추가하는데 길이가 3,7,4 객체이다.
		// 넓이가 20보다 작은 요소는 리스트에서 삭제하고 남아있는 원소를 전부 출력하라.
		ArrayList<Triangle> tArr = new ArrayList<>();
		tArr.add(new Triangle(6, 7));
		tArr.add(new Triangle(41, 1));
		tArr.add(new Triangle(3, 6));
		tArr.add(new Triangle(42, 7));

		System.out.printf("삭제 전 :");
		tArr.forEach((t) -> System.out.printf(t.findArea() + " "));
		System.out.println();

		tArr.removeIf((t) -> t.findArea() < 20);

		System.out.printf("삭제 후 :");
		tArr.forEach((t) -> System.out.printf(t.findArea() + " "));
		System.out.println();

	}
}

class Triangle {
	private int height, width;

	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public double findArea() {
		return this.height * this.width / 2.0;
	}

}