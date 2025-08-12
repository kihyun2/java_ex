package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(3) ? "짝수야" : "홀수야");
		System.out.println(even.test(4) ? "짝수야" : "홀수야");

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 5) ? "앞 숫자가 크다" : "뒷 숫자가 크다");
		System.out.println(bp.test(5, 3) ? "앞 숫자가 크다" : "뒷 숫자가 크다");

		Predicate<String> p = x -> x.equals("");
		System.out.println(p.test("Hello") ? "빈 문자열입니다." : "빈 문자열이 아닙니다.");
		System.out.println(p.test("") ? "빈 문자열입니다." : "빈 문자열이 아닙니다.");

	}
}
