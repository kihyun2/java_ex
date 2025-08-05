package ch06;

public class UpcastingDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "학생";
		Person p = s;
		System.out.println(p.name);
		Student s1 = (Student) p;
		System.out.println(s1.name);

		downcast(s);

		Employee e = new Employee();
		downcast(e);

		SportsPlayer sp = new SportsPlayer();
		downcast(sp);

//		Student[] sArr = new Student[3];
//		Employee[] eArr = new Employee[3];
//		SportsPlayer[] spArr = new SportsPlayer[3];
		Person[] pArr = new Person[4];
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportsPlayer();
		pArr[3] = new Entertainer();
		System.out.println("---");
		for (Person person : pArr) {
			person.whoAmI();
		}
	}

	public static void downcast(Person p) {
		p.whoAmI();
	}
}
