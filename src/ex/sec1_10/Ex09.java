package ex.sec1_10;

public class Ex09 {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}
}

class Parent {
	String name = "영조";

	void print() {
		System.out.println("나는 영조다.");
	}
}

class Child extends Parent {
	String name = "사도세자";

	@Override
	void print() {
		System.out.println("나는 사도세자다");
	}
}
