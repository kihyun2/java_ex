package ch07.sec06;

public class AnonymousDemo {

	Bird b = new Bird() {
		@Override
		public void move() {
			System.out.println("이름 없는 새가 날아간다.");
		}
	};

	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
	}
}
