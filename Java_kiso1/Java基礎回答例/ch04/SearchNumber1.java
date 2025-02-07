package ch04;

class SearchNumber1 {

	public static void main(String[] args) {
		// 整数型の配列
		int[] intArray = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 検索する数値を指定
		int searchNumber = 11;

		// 検索処理
		for (int i = 0; i < intArray.length; i++) { // 配列の長さ分のループ
			if (searchNumber == intArray[i]) {
				System.out.println(searchNumber + "が見つかりました。");
				break; // 見つかったらループを抜ける
			}
		}
	}
}
