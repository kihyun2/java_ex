package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int x = in.nextInt();
		System.out.printf("당신이 입력한 값은 %d 입니다.\n", x);
		System.out.print("실수 값을 입력하세요 : ");
		float f = in.nextFloat();
		System.out.printf("당신이 입력한 값은 %f 입니다.\n", f);
		in.nextLine();

		System.out.print("정수 값을 입력하세요 : ");
		String s = in.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다.\n", s);
		int number = Integer.parseInt(s);
		System.out.printf("s + 1 은 %d 입니다. \n", number + 10);

		System.out.print("실수 값을 입력하세요 : ");
		String d = in.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다.\n", d);
		float numbers = Float.parseFloat(d);
		System.out.printf("s + 1 은 %f 입니다. \n", numbers + 10);

		int i = in.nextInt();
		int a = in.nextInt();
		System.out.printf("%d * %d는 %d입니다.\n", i, a, i * a);

	}

}
