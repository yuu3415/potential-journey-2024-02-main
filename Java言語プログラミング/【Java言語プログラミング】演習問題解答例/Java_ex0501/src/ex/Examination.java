/*
 * Java_ex0501
 * Examination.java
 */
package ex;

/**
 * 試験を表すクラスです。
 * @author Yuki Kawamura
 */
public class Examination {
	/**
	 * 筆記試験の配点
	 */
	static final int PERFECT_SCORE = 100;

	/**
	 * 筆記試験の基準点
	 */
	static final int PASSING_SCORE = 70;

	/**
	 * 筆記試験の合否判定をします。
	 * @param score 筆記試験の得点
	 * @return 筆記試験の得点が基準点数以上であれば「筆記試験：合格」、
	 * 			そうでなければ「筆記試験：不合格」
	 */
	public static String judge(int score) {
		if (PASSING_SCORE <= score) {
			return "筆記試験：合格";
		} else {
			return "筆記試験：不合格";
		}
	}

	/**
	 * 実技試験の合否判定をします。
	 * @param grade 実技試験の評価グレード
	 * @return 実技試験の評価グレードがAであれば「実技試験：合格」、
	 * 			そうでなければ「実技試験：不合格」
	 */
	public static String judge(String grade) {
		if (grade.equals("A")) {
			return "実技試験：合格";
		} else {
			return "実技試験：不合格";
		}
	}

	/**
	 * 筆記試験と実技試験の結果を総合して合否判定をします。
	 * @param score 筆記試験の得点
	 * @param grade 実技試験の評価グレード
	 * @return 総合判定結果（「総合判定：合格」もしくは「総合判定：不合格」）
	 */
	public static String judge(int score, String grade) {
		if ((score >= 50 && grade.equals("A")) || (score >= 70 && grade.equals("B"))) {
			return "総合判定：合格";
		} else {
			return "総合判定：不合格";
		}
	}
}