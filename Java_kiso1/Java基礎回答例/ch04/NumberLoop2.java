package ch04;

class NumberLoop2 {

	public static void main(String[] args) {

		// 繰り返し処理
		for (int i = 1; i <= 50; i++) {

			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
