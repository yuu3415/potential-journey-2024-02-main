package ex;

public class Examination {
	static final int PERFECT_SCORE = 100;
	static final int PASSING_SCORE = 70;

	public String judge(int score) {
		String result;

		if (score >= 70) {
			result = "合格";
		} else {
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
			result = "不合格";
		}
		return result;

	}

	public String judge(int score, String grade) {
		String result;

		if (score >= 70) {
			if (grade.equals("A") || grade.equals("B")) {
				result = "合格";
			} else {
				result = "不合格";
			}

		} else if (score >= 50 && score < 70) {
			if (grade.equals("A")) {
				result = "合格";
			} else {
				result = "不合格";
			}
		} else {
			result = "不合格";
		}
		return result;
	}
}
