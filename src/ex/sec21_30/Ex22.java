package ex.sec21_30;

public class Ex22 {
	public static void main(String[] args) {
		System.out.println(new Studentss("김삿갓"));
		System.out.println(new Studentss("홍길동"));
	}
}

class Studentss {
	String name;

	public Studentss(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("학생[%s]", name);
	}
}
