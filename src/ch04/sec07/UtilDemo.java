package ch04.sec07;

public class UtilDemo {
	public static void main(String[] args) {
//		Util ut = new Util(); //The constructor Util() is not visible
		System.out.println(Util.fourTimes(5));
	}
}

class Util {
	static int fourTimes(int i) {
		return 4 * i;
	}

	private Util() {

	}
}
