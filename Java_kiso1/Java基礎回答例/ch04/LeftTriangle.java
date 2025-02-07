package ch04;

class LeftTriangle {

	public static void main(String[] args) {

		// 指定の高さまで繰り返し
		for (int i = 1; i <= 7; i++) {

			// 星印を表示する
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
