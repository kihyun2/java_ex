package ex.sec11_20;

import java.util.Arrays;

public class Ex16 {
	public static void main(String[] args) {
		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };
		System.out.println("정렬 전");
		for (Book book : books) {
			System.out.println(book.toString());
		}

		Arrays.sort(books);

		System.out.println("정렬 후");
		for (Book book : books) {
			System.out.println(book.toString());
		}

	}
}

class Book implements Comparable {
	int price;

	public Book(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Book b) {
			return this.price - b.price;
		}

		return 0;
	}

	@Override
	public String toString() {
		return String.format("Book [price = %d]", price);
	}
}