package ch08;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH) + 1 + "월");
	}
}
