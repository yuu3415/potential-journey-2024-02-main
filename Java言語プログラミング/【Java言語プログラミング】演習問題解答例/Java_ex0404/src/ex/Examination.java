/*
 * Java_ex0404
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
}