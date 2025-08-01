package ch04;

public class UmlEx {
	public static void main(String[] args) {
		Anima1 animal = new Anima1();
		animal.introduce("동물");
	}
}

class Anima1 {
	public int age;
	public String gender;

	public void isMammal() {

	}

	public void introduce(String str) {
		System.out.printf("이름이 %s입니다.", str);
	}
}

class Duck extends Anima1 {
	public String beakColor = "yellow";

	public void swim() {

	}

	public void quak() {

	}
}

class F1sh extends Anima1 {
	public int sizeInFt;

	public void swim() {

	}
}
