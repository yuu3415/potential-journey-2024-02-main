package ch04;

class TimesTable {

	public static void main(String[] args) {

		// 九九の表示
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j < 10) {
					System.out.print(" ");
				}
				System.out.print("  " + i * j);
			}
			System.out.println();
		}
	}
}
