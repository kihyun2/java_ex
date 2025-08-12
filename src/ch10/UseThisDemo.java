package ch10;

public class UseThisDemo {
	public static void main(String[] args) {
//		int one = 1;
		new UseThisDemo().lambda();
//		Comparator<String> c = (one, two) -> one.length() - two.length();
//		Lambda expression's parameter [one] cannot redeclare another local variable defined in an enclosing scope. 

	}

	public void lambda() {
//		String hi = "Hi";
		// 이건 익명 클래스이여서 내부 클래스에서 this를 찍으니 익명 클래스의 this를 나타내는 것
		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println(this);
//				hi = hi + "lambda"; // Local variable hi defined in an enclosing scope must be final or effectively final
			}
		};

		u1.use();

		// 이건 람다식일 때여서 UseThisDemo의 외부 객체의 this를 나타내는 거임.
		UseThis u2 = () -> {
			System.out.println(this);
//			hi = hi + "lambda";
		};
		u2.use();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UsethisDemo";
	}
}

interface UseThis {
	public void use();
}
