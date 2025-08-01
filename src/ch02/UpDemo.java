package ch02;

public class UpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j, i = 3;

		j = i++;

		System.out.printf("%d, %d\n", j, i); // 3, 4

		i = 3;
		j = ++i;
		System.out.printf("%d, %d\n", j, i); // 4, 4

	}

}
