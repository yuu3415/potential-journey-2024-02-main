/*
 * Java_ex0403
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
		System.out.print("筆記試験の合格基準は、");
		System.out.print(Examination.PERFECT_SCORE + "点満点中");
		System.out.println(Examination.PASSING_SCORE + "点です。");
	}
}