package ch03;

public class SwitchDemo {
	public static void main(String[] args) {
		Day day = Day.MONDAY;

		System.out.println(dayCheck(day));

	}

	private static String dayCheck(Day day) {

		String gubun = switch (day) {
		case SATURDAY, SUNDAY -> "주말";
		case MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY -> "평일";
		default -> "*";
		};
		return gubun;
	}
}

enum Day {
	MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
