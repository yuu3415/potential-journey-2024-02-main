package ch04;

class TestResult3 {

	public static void main(String[] args) {
		int score = -1; // 点数

		// 点数の判定
		if ((score < 0) || (100 < score)) {
			System.out.println("値が不正です。");
		} else if (70 <= score) {
			System.out.println("合格です！");
		} else {
			System.out.println("不合格です。");
		}

	}
}
