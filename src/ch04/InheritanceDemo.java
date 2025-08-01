package ch04;

public class InheritanceDemo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		Tiger tiger = new Tiger();
		tiger.move();
		Bird bird = new Bird();
		bird.move();
		Fish fish = new Fish();
		fish.move();
	}
}

class Animal {
	// 주둥이
	String mouth;

	// eat
	void eat() {
		System.out.println("먹습니다.");
	}

	// move()
	void move() {
		System.out.println("움직입니다.");

	}
}

class Tiger extends Animal {
	// 뛴다
	// move 오버라이딩
	@Override
	void move() {
		System.out.println("뜁니다.");
	}
}

class Fish extends Animal {
	// 헤엄친다
	// move 오버라이딩
	@Override
	void move() {
		System.out.println("헤엄칩니다.");
	}
}

class Bird extends Animal {
	// 난다
	// move 오버라이딩
	@Override
	void move() {
		System.out.println("날아갑니다.");
	}

}
