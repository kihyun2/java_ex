package ch06;

public class DowncastDemo {
	public static void main(String[] args) {
		// class casting exceptioon
		// Person p = new Person();
		// Student s = (Student) p;

		Student s = new Student();
		Person p = s;
		System.out.println(p.name);
		p.whoAmI();
		// p.number; p.work;
		Student s2 = (Student) p;
		System.out.println(s2.number);
		s2.work();

		Person[] pArr = { new Student(), new Employee(), new SportsPlayer(), new Entertainer() };
//		pArr[0] = new Student();
//		pArr[1] = new Employee();
//		pArr[2] = new SportsPlayer();
//		pArr[3] = new Entertainer();

		for (Person person : pArr) {
//			person.whoAmI();
			person.work();
//			if (person instanceof Student) {
//				Student s0 = (Student) person;
//				s0.work();
//			} else if (person instanceof Employee) {
//				Employee e0 = (Employee) person;
//				e0.work();
//			} else if (person instanceof SportsPlayer) {
//				SportsPlayer sp0 = (SportsPlayer) person;
//				sp0.work();
//			} else if (person instanceof Entertainer) {
//				Entertainer et0 = (Entertainer) person;
//				et0.work();
//			}

		}
	}
}
