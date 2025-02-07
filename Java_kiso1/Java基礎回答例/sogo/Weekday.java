package sogo;

class Weekday {

	public static void main(String[] args) {

		String[] weekday = getWeekdayName();

		System.out.print("曜日一覧：");

		for (int i = 0; i < weekday.length; i++) {
			System.out.print(weekday[i]);
			if (i < (weekday.length - 1)) {
				System.out.print(", ");
			}
		}
	}

	/**
	 * 英字の曜日名を格納した配列を返す
	 * @return 英字の曜日名を格納した配列
	 */
	static String[] getWeekdayName() {

		String[] weekday = { "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };

		return weekday;
	}
}
