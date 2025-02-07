/*
 * Java_ex0503
 * ExamTest.java
 */
package ex;

/**
 * Examineeのテストクラスです。
 * @author Yuki Kawamura
 */
public class ExamTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		Examinee examinee = new Examinee("市川京子", 72, "B");
		examinee.showInfo();
		examinee.showJudge();
	}
}