package ch04;

class SearchNumber2 {

	public static void main(String[] args) {
		// 整数型の配列
		int[] intArray = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 検索する数値を指定
		int searchNumber = 11;

		// 検索処理
		boolean flag = false; // 検索フラグ（初期値は偽）
		for (int i = 0; i < intArray.length; i++) { // 配列の長さ分のループ

			if (searchNumber == intArray[i]) { // 文字列を比較して同じかを判定する
				flag = true; // 検索フラグに真を代入する
				break; // 見つかったらループを抜ける
			}
		}

		if (flag) {
			System.out.println(searchNumber + " が見つかりました。");
		} else {
			System.out.println(searchNumber + " は見つかりませんでした。");
		}
	}
}
