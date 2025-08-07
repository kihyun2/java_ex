package ex;

import java.util.Arrays;

public class Ex17 {
	public static void main(String[] args) {
		Person1[] pArr = { new Person1("박지성", 40, 175, 68), new Person1("홍길동", 32, 170, 75),
				new Person1("손흥민", 20, 180, 70) };

		Arrays.sort(pArr, (a, b) -> b.age - a.age);
		for (Person1 person1 : pArr) {
			System.out.println(person1.toString());
		}

	}

}

class Person1 {
	int age, height, weight;
	String name;

	public Person1(String name, int age, int height, int weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("Person [이름=%s, 나이=%d, 키=%d, 몸무게=%d]", name, age, height, weight);
	}
}