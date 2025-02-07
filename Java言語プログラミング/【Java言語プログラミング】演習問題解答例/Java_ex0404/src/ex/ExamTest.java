/*
 * Java_ex0404
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

		// 筆記試験が70点だった場合
		String writtenJudge = Examination.judge(70);
		System.out.println(writtenJudge);

		// 筆記試験が69点だった場合
		System.out.println(Examination.judge(69));
	}
}