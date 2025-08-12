package ch10;

import java.util.Arrays;

public class CaparableDemo {
	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5) };

		Arrays.sort(rectangles); // compareTo의 기본 정렬 방식으로 정렬됨, ascending 방식 정렬(오름차순인듯)
		Arrays.sort(rectangles, (o1, o2) -> o1.getHeight() - o2.getHeight()); // 기본 정렬 방식이 아닌 다른 기준으로 정렬 ==> 높이 기준

		System.out.println(Arrays.toString(rectangles));
	}
}

class Rectangle implements Comparable<Rectangle> {
	private int width, height;

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int findArea() {
		return width * height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return this.findArea() - o.findArea();
	}
}
