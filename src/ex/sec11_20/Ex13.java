package ex.sec11_20;

public class Ex13 {
	public static void main(String[] args) {

	}
}

interface Edible {
	void eat();
}

interface Sweetable {
	void sweet();
}

interface Delicious extends Edible, Sweetable {

}