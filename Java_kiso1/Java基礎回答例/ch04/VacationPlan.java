package ch04;

class VacationPlan {
	 
	public static void main(String[] args) {
		int vacationType; // 数値
		String message; // メッセージ

		vacationType = 7;

		// switch文による判定
		switch (vacationType) {
		case 1:
			message = "春期休暇";
			break;

		case 2:
			message = "夏期休暇";
			break;

		case 3:
			message = "冬期休暇";
			break;

		default:
			message = "休暇予定はありません";
			break;
		}

		// 結果を表示
		System.out.println("次回の休暇予定：" + message);
	}
}
