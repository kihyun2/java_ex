package ch09;

import java.util.ArrayList;

public class GenericClassDemo2 {
	public static void main(String[] args) {
		Cup<Beer> beerCup = new Cup<>();
//		beerCup.setBeverage(new Beer());
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(10);
	}
}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다.");
	}
}

class Barleytea extends Beverage {
	void eat() {
		System.out.println("보리차를 마신다.");
	}
}
