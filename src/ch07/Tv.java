package ch07;

public class Tv implements Controllable, RemoteControllable {
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("TV를 끈다.");

	}
}

class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다.");

	}
}

class Notebook extends Computer implements Portable {
	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");

	}

	@Override
	public void inMyBag() {
		System.out.println("노트북은 내 가방 안에 있다.");
	}
}