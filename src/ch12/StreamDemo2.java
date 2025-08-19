package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4, 5 };
		IntStream is = Arrays.stream(ia);
		String[] sa = { "a", "b", "c", "d", "e" };
		Stream<String> ss = Stream.of(sa);
		double[] da = { 1.0, 2.9, 3.0, 4.2, 5.3 };
		DoubleStream ds = DoubleStream.of(da);

		IntStream iis = IntStream.of(ia);

		Random r = new Random();
		IntStream ints = r.ints(0, 100);
//		ints.forEach(n -> System.out.println(n));
		IntStream iterate = IntStream.iterate(1, i -> i + 2);
		iterate.limit(3).forEach(n -> System.out.println(n));

	}
}
