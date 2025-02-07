package sogo;

class Triangle2 {

	public static void main(String[] args) {

		drawTriangle(7);

	}

	/**
	 * 「*」で三角形を表示する
	 * @param height 三角形の高さ
	 */
	static void drawTriangle(int height) {
		// 指定の高さまで繰り返し
		for (int i = 1; i <= height; i++) {

			// 空白を表示する
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}

			// 星印を表示する
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
