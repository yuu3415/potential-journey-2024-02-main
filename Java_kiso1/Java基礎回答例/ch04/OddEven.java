package ch04;

class OddEven {
 
	public static void main(String[] args) {
		int num = 0;	// 数値
		String message;	// メッセージ

		// 対象値の判定
		if (num > 0) {
			// 偶数・奇数の判定
			if (num % 2 == 0) {
				message = num + "は偶数です。";
			} else {
				message = num + "は奇数です。";
			}
		} else {
			message = "0より大きい値を設定してください。";
		}

		// 結果を表示する
		System.out.println(message);
	}
}
