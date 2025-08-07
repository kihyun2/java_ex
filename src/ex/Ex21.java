package ex;

public class Ex21 {
	public static void main(String[] args) {
		Persons p1 = new Persons("111111", "홍길동");
		Persons p2 = new Persons("111111", "손흥민");
		Persons p3 = new Persons("123456", "손흥민");
		if (p1.equals(p2)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}
		if (p2.equals(p3)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}
	}
}

class Persons {
	String id, name;

	public Persons(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persons p) {
			return p.id.equals(this.id) && p.name.equals(this.name);
		}
		return false;
	}
}
