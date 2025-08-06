package ex;

public class Ex12 {
	public static void main(String[] args) {
		Concrete c = new Concrete(100, 50);
		c.show();
	}
}

abstract class Abstract {
	int i;

	abstract void show();

	public Abstract(int i) {
		this.i = i;
	}
}

class Concrete extends Abstract {
	int i;

	public Concrete(int i, int a) {
		super(i);
		this.i = a;

	}

	@Override
	void show() {
		System.out.printf("Abstract.i : %d, Concrete.i : %d \n", super.i, this.i);
	}
}
