package ch10;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaFuctionalInterface {
	public static void main(String[] args) {
		// FunctionalInterface
		// ==> Runnable(void run()), Supplier<T>(T get())
		// ==> Consumer<T>(void accept(T t)), Function<T, R>(R apply(T t))
		// ==> Predicate<T>(boolean test(T t))

		Predicate<String> isEmptyStr = (t) -> (t == null || t == "") ? true : false;
		System.out.println(isEmptyStr.test(null));

		Consumer<String> printString = s -> System.out.println(s);
		printString.accept("Hello");
	}
}
