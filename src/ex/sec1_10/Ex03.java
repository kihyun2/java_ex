package ex.sec1_10;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String url = "";
//		ArrayList<String> parse = new ArrayList<>();
		while (true) {
			System.out.printf("URL을 입력하세요: ");
			url = in.nextLine();

			if (url.equals("bye") || url.indexOf('.') == -1) {
				break;
			}

			String[] parse = url.split(".");

//			int start = 0;
//			for (int i = 0; i < url.length(); i++) {
//				if (url.charAt(i) == '.') {
//					parse.add(url.substring(start, i));
//					start = i + 1;
//				}
//			}
//			parse.add(url.substring(start));
			System.out.println(parse.toString());
//			System.out.printf("%s는 %s로 끝납니다.\n", url, parse[parse.length - 1]);
//			for (int i = 1; i < parse.length - 1; i++) {
//				System.out.printf("%s는 %s를 포함합니다.\n", url, parse[i]);
//			}
//			System.out.printf("%s는 %s로 시작합니다.\n", url, parse[0]);
		}
		in.close();
	}
}
