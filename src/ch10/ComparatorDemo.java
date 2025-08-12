package ch10;

import java.util.Arrays;

public class ComparatorDemo {
	public static void main(String[] args) {
		String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

		Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(strings));
	}
}
