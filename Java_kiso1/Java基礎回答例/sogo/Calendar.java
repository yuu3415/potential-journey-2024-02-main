package sogo;

public class Calendar {

	public static void main(String[] args) {

		int month = Integer.parseInt(args[0]);

		outputCalendar(month);

	}

	/**
	 * 引数で指定された月のカレンダーを表示する
	 * @param month 月
	 */
	static void outputCalendar(int month) {
		
		int[] endOfDateList = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println(month + "月カレンダー");

		// 曜日の表示
		System.out.println(" 日 月 火 水 木 金 土");

		// 繰り返し日付の表示
		for (int i = 1; i <= endOfDateList[month - 1]; i++) {
			if (i < 10) {
				System.out.print(" ");
			}

			// 土曜日で改行
			if (i % 7 == 0) {
				System.out.println(" " + i);
			} else {
				System.out.print(" " + i);
			}
		}
	}
}
