package ex;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(countChar("hello", 'L'));
		System.out.println(countChar("hello", 'l'));
	}

	static int countChar(String s, char c) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == c || s.toUpperCase().charAt(i) == c) {
				result++;
			}
		}
		return result;
	}
}
