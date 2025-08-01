package ch05;

public class StringDemo5 {
	public static void main(String[] args) {
		String formatStr = String.format("%s %d", "JDK", 14);
		System.out.println(formatStr);

		String joinStr = String.join(", ", "apple", "banana", "cherry", "durian");
		System.out.println(joinStr);

		String v1 = String.valueOf(false);
		String v2 = String.valueOf(10);
		System.out.println(v1 + ", " + v2);
	}
}
