package ch03;

class IntArray {
	public static void main(String[] args) {
		// 整数型の配列を定義
				int[] numbers = new int[5];

				// 値を代入する
				numbers[0] = 10;
				numbers[1] = 20;
				numbers[2] = 30;
				numbers[3] = 40;
				numbers[4] = 50;
				
				// 配列の初期化子を使った場合
//				int[] numbers = {10, 20, 30, 40, 50};

				// 先頭と最後尾の値を表示する
				System.out.println("先頭の要素：" + numbers[0]);
				System.out.println("最後尾の要素：" + numbers[4]);
				System.out.println("要素数：" + numbers.length);
	}
}
