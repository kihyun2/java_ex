package ex.sec21_30;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex28 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 35));
		for (Person person : set) {
			System.out.println(person);
		}

	}
}

class Person {
	int age;
	String name;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o instanceof Person) {
			return this.hashCode() == o.hashCode();
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person[%s : %d]", name, age);
	}
}
