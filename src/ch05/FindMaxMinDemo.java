package ch05;

import java.util.Arrays;

public class FindMaxMinDemo {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 2 };

		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("max = %d, min = %d", max, min);
		System.out.printf("max = %d, min = %d", max, min);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
