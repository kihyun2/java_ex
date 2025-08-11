package ch10;

public class LambdaDemo {
	public static void main(String[] args) {
		MyFunction f = (a, b) -> a > b ? a : b;

		int value = f.max(3, 5);
		System.out.println("최대값은 => " + value);

//		PrintFunction pf = new PrintFunction() {
//			@Override
//			public void printVar(String name, int i) {
//				System.out.println(name + "=" + i);
//			}
//		};
		PrintFunction pf = (name, i) -> System.out.println(name + "=" + i);
		pf.printVar("hello", value);
//		MySquareFunction sf = new MySquareFunction() {
//
//			@Override
//			public int Square(int x) {
//
//				return x * x;
//			}
//		};
		MySquareFunction sf = (x) -> x * x;
		System.out.println(sf.Square(3));
//		RollFunction rf = new RollFunction() {
//
//			@Override
//			public int roll() {
//				return (int) (Math.random() * 6) + 1;
//			}
//		};

		RollFunction rf = () -> (int) (Math.random() * 6) + 1;
		System.out.println(rf.roll());

		YourFunction yf = (a, b) -> a < b ? a : b;
		System.out.println("최소값은 => " + yf.min(3, 10));

	}
}

@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface MySquareFunction {
	int Square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}