package ch06;

public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "부모";
		p.method1();

		Child c = new Child();
		c.myName = "";
	}
}

class Parent {
	// 핃드
	String name;

	// 메서드
	void method1() {
		System.out.println("메서드1 입니다.");
	}
}

class Child extends Parent {
	String myName;

	void method2() {
		System.out.println("메서드2 입니다.");
	}
}
