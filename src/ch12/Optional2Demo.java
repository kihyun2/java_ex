package ch12;

import java.util.Optional;

public class Optional2Demo {
	public static void main(String[] args) {
		String s = "Hello";
		Optional<String> o = Optional.ofNullable(s);
//		String s1 = o.orElse("빈문자열");
//		System.out.println(s1);
		if (o.isPresent()) {
			Util.print(o.get());
		} else {
			String s1 = o.orElse("빈문자열");
			System.out.println(s1);
		}
	}
}
