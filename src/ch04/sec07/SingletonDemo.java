package ch04.sec07;

public class SingletonDemo {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // The constructor Singleton() is not visible
		Singleton s1 = Singleton.getInstance();
	}
}

class Singleton {

	// static 변수
	private static Singleton singleton = new Singleton();

	// 생성자
	private Singleton() {
	}

	// static 메서드
	public static Singleton getInstance() {
		return singleton;
	}

}
