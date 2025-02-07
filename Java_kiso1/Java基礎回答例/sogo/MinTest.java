package sogo;

class MinTest {

	public static void main(String[] args) {

		// コマンドライン引数を元に配列を生成
		int[] numbers = new int[args.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		// メソッドにnumbersを渡して呼び出し
		// 結果をminに代入
		int min = min(numbers);

		// 表示
		System.out.print("入力された数値：");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n配列中の最小値：" + min);
	}

	/**
	 * 配列の最小要素を返すメソッド
	 * @param ary 処理する配列
	 * @return 配列の最小要素
	 */
	static int min(int[] ary) {
		int min = ary[0]; // 仮の最小値

		// 最小値検索
		for (int i = 1; i < ary.length; i++) {
			if (ary[i] < min) {
				min = ary[i];
			}
		}
		return min;
	}
}