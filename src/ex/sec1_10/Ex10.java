package ex.sec1_10;

public class Ex10 {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };
		for (Phone phone : phones) {
			if (phone instanceof Smartphone s) {
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			}
		}
	}
}

class Phone {
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	void talk() {
		System.out.printf("%s가 통화 중\n", owner);
	}
}

class Telephone extends Phone {
	private String when;

	public Telephone(String name, String when) {
		super(name);
		this.when = when;
	}

	void autoAnswering() {
		System.out.printf("%s가 부재중이니 %s에 전화 요망\n", super.getOwner(), when);
	}
}

class Smartphone extends Telephone {
	private String game;

	public Smartphone(String name, String game) {
		super(name, null);
		this.game = game;
	}

	void playGame() {
		System.out.printf("%s가 %s 게임 중", super.getOwner(), game);
	}
}