package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Weekday {
	public static void main(String[] args) {

		String[] array = getWeekdayName();

		System.out.print("曜日一覧：");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("Saturday");
	}

	static String[] getWeekdayName() {
		String[] array = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return array;
	}
}
