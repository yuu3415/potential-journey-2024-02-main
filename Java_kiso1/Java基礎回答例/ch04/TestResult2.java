package ch04;

class TestResult2 {

	public static void main(String[] args) {
		int score; // 点数
		String result; // 判定メッセージ

		score = 69;

		// 点数の判定
		if (score >= 70) {
			result = "合格";
		} else {
			result = "不合格";
		}

		// 結果を表示
		System.out.println("あなたは <<" + result + ">> です！");
	}
}
