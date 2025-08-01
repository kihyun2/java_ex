package ch05;

public class MutableDemo {
	public static void main(String[] args) {
		Cat c1 = new Cat("나비");
		Cat c2 = c1;
		System.out.println(c1.getName() + ":" + c2.getName());
		c2.setName("호랑");
		System.out.println(c1.getName() + ":" + c2.getName());
	}
}

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
