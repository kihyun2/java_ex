package ex;

public class Ex19 {
	public static void main(String[] args) {
		Controller[] c = { new Tv(false), new Radio(true) };
		for (Controller controller : c) {
			controller.show();
		}
	}
}

abstract class Controller {
	private boolean power;

	void show() {
		if (power) {
			System.out.println(getName() + "가 켜졌습니다");
		} else {
			System.out.println(getName() + "가 꺼졌습니다");
		}
	}

	public Controller(boolean power) {
		this.power = power;
	}

	abstract String getName();
}

class Tv extends Controller {
	public Tv(boolean power) {
		super(power);
//		super.power = power;
	}

	@Override
	String getName() {
		return "TV";
	}
}

class Radio extends Controller {
	public Radio(boolean power) {
		super(power);
	}

	@Override
	String getName() {
		return "Radio";
	}
}