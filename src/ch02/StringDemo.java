package ch02;

public class StringDemo {

	public static void main(String[] args) {
//		char c = '';  빈 문자는 허용 안됨
		String s = ""; // 문자열은 가능
		String res = "" + 7 + 7; // 문자열 먼저 더해져서 다 문자열 더하기로 연산됨
		String res1 = 7 + 7 + "";// 정수 먼저 계산 하고 -> 7+7=14 그리고 나서 문자열 더해져서 문자열됨.

	}

}
