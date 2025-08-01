package ch04;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("철영이").setAge(3).setNationality("대한민국");
		p.sayHello();
	}
}

class Person {
	private String name;
	private int age;
	private String nationality;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.printf("%s에 사는 %d살 %s입니다.\n", nationality, age, name);
	}
}
