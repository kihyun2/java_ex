package ch02;

public class ComLogicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;
		System.out.println(x < y && x == 0); // true
		System.out.println(x > y); // false

		// 쇼트 서킷 (논리 &&) 조건식 1이 false 이면 조건식2를 조사하지 않고 성능 개선
		System.out.println(x > y && 5 / 0 == 0); // 예외 발생 없이 false 출력 => 조건1이 false 라서 뒤로 안 넘어감

		// 쇼트 서킷 (논리 ||) 조건식 1이 true 면 조건식2를 조사하지 않고 성능 개선
		System.out.println(x < y || 5 / 0 == 0); // 예외 발생 없이 true 출력 => 조건1이 true 라서 뒤로 안 넘어감

	}

}
