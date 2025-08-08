package ch09;

import java.util.StringTokenizer;

public class UnCheckedDemo {
	public static void main(String[] args) {
		String str = "";
//		String str = null;
		System.out.println(str.length()); // java.lang.NullPointerException
		int[] arr = new int[0];
//		int[] arr = null;
		System.out.println(arr.length); // java.lang.NullPointerException

//		System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException

		String s = "a b c";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			st.nextToken();
		}
//		st.nextToken(); // java.util.NoSuchElementException

	}
}
