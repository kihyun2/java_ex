package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(7);

		Collections.sort(arr);
		System.out.println(arr);

		// 내림차순으로 정렬하려면 두번째 매개변수인 Comparator FI를 구현해야 한다.
//		Collections.sort(arr, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		Collections.sort(arr, (a, b) -> b - a);
		System.out.println(arr);
		ArrayList<String> sArr = new ArrayList<String>();
		sArr.add("c");
		sArr.add("a");
		sArr.add("d");

		Collections.sort(sArr);
		System.out.println(sArr);
		// 내림차순으로 정렬하려면 두번째 매개변수인 Comparator FI를 구현해야 한다.
		// 숫자와 다르게 문자열끼리 비교하려면
//		Collections.sort(sArr, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}
//		});
		Collections.sort(sArr, (a, b) -> b.compareTo(a));
		System.out.println(sArr);
		// Line을 담고 있는 ArrayList 라면 어떻게 비교하지?
		ArrayList<Line> lArr = new ArrayList<Line>();
		lArr.add(new Line(3));
		lArr.add(new Line(5));
		lArr.add(new Line(4));
		lArr.add(new Line(2));

//		for (Line line : lArr) {
//			System.out.printf(line.length + " ");
//		}
		lArr.forEach((t) -> System.out.printf(t.length + " "));
		System.out.println();
		Collections.sort(lArr, (a, b) -> b.length - a.length);

//		for (Line line : lArr) {
//			System.out.printf(line.length + " ");
//		}
		lArr.forEach((t) -> System.out.printf(t.length + " "));
		System.out.println();

	}
}

class Line {
	int length;

	public Line(int length) {
		this.length = length;
	}
}
