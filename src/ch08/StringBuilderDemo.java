package ch08;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.hashCode());
		sb.append("!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}
