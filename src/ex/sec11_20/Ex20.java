package ex.sec11_20;

public class Ex20 {
	public static void main(String[] args) {
		Human.echo();
		Students s = new Students(20);
		s.print();
		s.eat();
		Human p = new Worker();
		p.print();
		p.eat();
	}
}

interface Human {
	void eat();

	default void print() {
		System.out.println("인간입니다.");
	}

	static void echo() {
		System.out.println("야호 !!!");
	}
}

class Worker implements Human {
	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}

}

class Students implements Human {
	int age;

	public Students(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("도시락을 먹습니다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(age + "세의 학생입니다.");
	}
}
