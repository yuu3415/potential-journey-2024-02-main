package ex;

public class Examination {
	static final int PERFECT_SCORE = 100;
	static final int PASSING_SCORE = 70;

	public String judge(int score) {
		String result;

		if (score >= 70) {
			System.out.println("筆記試験：合格");
			result = "合格";
		} else {
			System.out.println("筆記試験：不合格");
			result = "不合格";
		}
		return result;
	}

	public String judge(String grade) {
		String result;

		if (grade.equals("A")) {
			System.out.println("実技試験：合格");
			result = "合格";
		} else {
			System.out.println("実技試験：不合格");
			result = "不合格";
		}
		return result;

	}

	public String judge(int score, String grade) {
		String result;

		if (score >= 70) {
			if (grade.equals("A") || grade.equals("B")) {
				System.out.println("総合判定：合格");
				result = "合格";
			} else {
				System.out.println("総合判定：不合格");
				result = "不合格";
			}

		} else if (score >= 50 && score < 70) {
			if (grade.equals("A")) {
				System.out.println("総合判定：合格");
				result = "合格";
			} else {
				System.out.println("総合判定：不合格");
				result = "不合格";
			}
		} else {
			System.out.println("総合判定：不合格");
			result = "不合格";
		}
		return result;
	}
}
