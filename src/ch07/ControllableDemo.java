package ch07;

public class ControllableDemo {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();

		Computer computer = new Computer();
		computer.turnOn();
		computer.turnOff();
		computer.repair();

		Notebook notebook = new Notebook();
		notebook.inMyBag();
		notebook.turnOn();
		notebook.turnOff();
	}
}
