package ch04;

class TimeMessage {

	public static void main(String[] args) {
		int time; // 時間
		String message; // 判定メッセージ

		time = 3;

		// 時間判定
		if ((time <= 5) || (time == 24)) {
			message = "おやすみ";
		} else if (time <= 11) {
			message = "おはよう";
		} else if (time <= 17) {
			message = "こんにちは";
		} else {
			message = "こんばんは";
		}

		// メッセージの表示
		System.out.print(time + "時　" + message);
	}
}
