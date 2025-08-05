package ch06;

public class InheritanceDemo2 {
	public static void main(String[] args) {

	}
}

class A {
	String name;

	void method1() {
		System.out.println("A의 메소드입니다.");
	}
}

class B extends A {
	String name;

	@Override
	void method1() {
		System.out.println("B의 메소드입니다.");
	}
}

//class C extends B {}
class C extends A {
}

class D extends A {
}