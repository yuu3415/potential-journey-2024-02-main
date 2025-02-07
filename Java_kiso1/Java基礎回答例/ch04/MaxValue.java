package ch04;

class MaxValue {

	public static void main(String[] args) {
		// 整数型の配列
		int[] numbers = { 3, 19, 25, 12, 22, 9, 5, 15, 7, 12 };

		int max = numbers[0]; // 比較対象の初期値

		// 配列の2番目の要素から順に比較していく
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) { // 最大値より大きい場合
				max = numbers[i]; // 最大値を更新
			}
		}
		System.out.println(" 最大値：" + max);
	}
}
