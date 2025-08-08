package ex.sec1_10;

public class Ex08 {
	public static void main(String[] args) {
		Person[] pArr = { new Person("길동이", 22), new Student("황진이", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };
//		Person p = new Person();
//		Student s = new Student();
//		ForeignStudent f = new ForeignStudent();
//
//		p.setName("길동이");
//		p.setAge(22);
//		pArr[0] = p;
//
//		s.setName("황진이");
//		s.setAge(23);
//		s.setId(100);
//		pArr[1] = s;
//
//		f.setName("Amy");
//		f.setAge(30);
//		f.setId(200);
//		f.setNation("U.S.A");
//		pArr[2] = f;

		for (Person person : pArr) {
			System.out.println(person.show());
		}

	}
}

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String show() {
		return String.format("사람[이름: %s, 나이: %d]", getName(), getAge());
	}

}

class Student extends Person {
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super.setAge(age);
		super.setName(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	String show() {
		return String.format("사람[이름: %s, 나이: %d, 학번: %d]", super.getName(), super.getAge(), getId());
	}

}

class ForeignStudent extends Student {
	private String nation;

	public ForeignStudent() {
	}

	public ForeignStudent(String name, int age, int id, String nation) {
		super.setAge(age);
		super.setName(name);
		super.setId(id);
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	String show() {
		return String.format("사람[이름: %s, 나이: %d, 학번: %d, 국적: %s]", super.getName(), super.getAge(), super.getId(),
				getNation());
	}
}
