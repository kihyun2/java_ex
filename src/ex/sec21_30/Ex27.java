package ex.sec21_30;

import java.util.ArrayList;

public class Ex27 {
	public static void main(String[] args) {
		ArrayList<String> sArr = new ArrayList<String>();
		sArr.add("갈매기");
		sArr.add("나비");
		sArr.add("달라이");
		sArr.add("라마");

		for (String string : sArr) {
			if (string.length() == 2) {
				System.out.println(string);
			}
		}
	}
}
