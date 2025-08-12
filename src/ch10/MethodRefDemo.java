package ch10;

public class MethodRefDemo {
	public static void main(String[] args) {
		Pickable p = String::charAt;
		System.out.println(p.pick("hello", 0));

		Computable c;
		Utils utils = new Utils();
//		c = (a,b) -> utils.add(a,b);
		c = utils::add;
		System.out.println(c.compute(3, 4));

		Mathematical m;
		m = Math::abs;
		System.out.println(m.calculate(-3));

	}
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

@FunctionalInterface
interface Mathematical {
	int calculate(int a);
}