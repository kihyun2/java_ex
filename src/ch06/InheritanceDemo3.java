package ch06;

public class InheritanceDemo3 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sleep();
		animal.move();

		Eagle eagle = new Eagle();
		eagle.eye = "독수리눈";
		eagle.move();

		Tiger tiger = new Tiger();
		tiger.mouth = "호랑이입";
		tiger.move();

		Goldfish goldfish = new Goldfish();
		goldfish.eat();
		goldfish.move();

	}
}

class Animal {
	String eye;
	String mouth;

	void eat() {

	}

	void sleep() {

	}

	void move() {
		System.out.println("동물은 움직인다.");
	}
}

class Eagle extends Animal {
	String wing;

	@Override
	void move() {
		System.out.println("독수리는 날아요.");
	}
}

class Tiger extends Animal {
	String leg;

	@Override
	void move() {
		System.out.println("호랑이는 달려요.");
	}
}

class Goldfish extends Animal {
	String fin;

	@Override
	void move() {
		System.out.println("금붕어는 헤엄쳐요.");
	}
}
