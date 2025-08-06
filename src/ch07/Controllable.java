package ch07;

/**
 * 전자제품의 제어부를 위한 기능을 포함하고 있고 turnOn(), turnOff()가 있으니 구현부를 오버라이드해서 사용하면 됨
 */
public interface Controllable {
	/**
	 * @param none
	 * @return void
	 */
	void turnOn();

	void turnOff();

	default void repair() {
		show("장비를 수리한다.");
	}

	private void show(String s) {
		System.out.println(s);
	}

}

interface Portable {
	void inMyBag();
}