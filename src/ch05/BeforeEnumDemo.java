package ch05;

public class BeforeEnumDemo {
	public static void main(String[] args) {

		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);

		System.out.println(Num.ONE);
		System.out.println(Num.TWO);

		People p = new People();
		p.age = 21;
		p.gender = Gender.MALE;

		if (p.age >= 18) {
			System.out.println("성인입니다.");
		}
		if (p.gender == Gender.MALE) {
			System.out.println("남성입니다");

		}
		if (p.gender == Gender.FEMALE) {
			System.out.println("876여성입니다");

		}
	}
}

//class People {
//	// 정적 (클래스, static) 상수
//	static final int MALE = 0;
//	static final int FEMALE = 1;
//	static final int ONE = 1;
//	static final int TWO = 2;
//
//	// 인스턴스 상수
//	final int KIND = 0;
//	final int NUM = 1;
//}

class People {
	int age;
	Gender gender;
}

enum Gender {
	MALE, FEMALE;

	String gender;

	Gender() {
	}

	Gender(String gender) {
		this.gender = gender;
	}
}

enum Num {
	ONE, TWO
}