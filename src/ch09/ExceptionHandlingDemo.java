package ch09;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void method1() throws InterruptedException {
		method2();
	}

	static void method2() throws InterruptedException {
		Thread.sleep(100);
	}
}
