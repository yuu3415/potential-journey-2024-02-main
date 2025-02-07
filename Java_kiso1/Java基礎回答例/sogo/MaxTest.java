package sogo;

class MaxTest {
	 
	public static void main(String[] args) {
		int[] numbers = { 17, 68, 14, 55, 70, 12, 21, 63, 88, 50 };
		int max;

		// メソッドにnumbersを渡して呼び出し
		// 結果をmaxに代入
		max = max(numbers);
		
		// 表示
		System.out.print("配列：");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n配列中の最大値：" + max);
	}

	/**
	 * 配列の最大要素を返すメソッド
	 * @param ary 処理する配列
	 * @return 配列の最大要素
	 */
	static int max(int[] ary) {
		int max = ary[0]; // 仮の最大値

		// 最大値検索
		for (int i = 1; i < ary.length; i++) {
			if (ary[i] > max) {
				max = ary[i];
			}
		}
		return max;
	}
}