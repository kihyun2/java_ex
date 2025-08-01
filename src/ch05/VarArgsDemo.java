package ch05;

public class VarArgsDemo {
	public static void main(String[] args) {
		System.out.println(add(2));
	}

	public static int add(int... number) {
		int result = 0;
		for (int i : number) {
			result += i;
		}
		return result;
	}
}
