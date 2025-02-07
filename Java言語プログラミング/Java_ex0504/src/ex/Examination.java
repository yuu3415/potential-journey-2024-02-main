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
		String result = null;

		if (grade == null) {
			result = "不合格";
		} else if (grade.equals("A")) {
			result = "合格";
		} else if (grade.equals("B") || grade.equals("C")) {
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
