package ch04;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S25";
		myPhone.value = 200;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 250;
		yourPhone.print();

	}
}

class Phone {
	String model;
	int value;

	void print() {
		System.out.printf("%d만원 짜리 %s 스마트폰\n", value, model);
	}
}
