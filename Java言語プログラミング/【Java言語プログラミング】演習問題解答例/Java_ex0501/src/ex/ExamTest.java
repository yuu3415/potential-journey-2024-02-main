/*
 * Java_ex0501
 * ExamTest.java
 */
package ex;

/**
 * Examinationのテストクラスです。
 * @author Yuki Kawamura
 */
public class ExamTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		int score = 70;
		String grade = "B";

		// 筆記試験単体の合否判定結果を表示
		System.out.println(Examination.judge(score));

		// 実技試験単体の合否判定結果を表示
		System.out.println(Examination.judge(grade));

		// 総合判定結果を表示
		System.out.println(Examination.judge(score, grade));
	}
}