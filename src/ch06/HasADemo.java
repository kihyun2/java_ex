package ch06;

public class HasADemo {
	public static void main(String[] args) {
		Engine e = new Engine();
		Car c = new Car();
	}
}

class Engine {

}

class Car {
	private Engine engine;

	public Car() {
		this.engine = new Engine();
	}

	// 생성자 ==> 생성시에 부품을 주입 ==> 생성자 주입
	public Car(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return this.engine;
	}

	// 설정자(setter) ==> 생성한 후에 부품을 주입/변경 ==> 설정자 주입
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
