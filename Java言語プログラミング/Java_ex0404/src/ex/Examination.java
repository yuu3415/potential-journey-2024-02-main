package ex;

public class Examination {
	static final int PERFECT_SCORE = 100;
	static final int PASSING_SCORE = 70;

	public String judge(int score) {
		String result = null;

		if (score >= 70) {
			System.out.println("筆記試験：合格");
		} else {
			System.out.println("筆記試験：不合格");
		}
		return result;
	}

}
