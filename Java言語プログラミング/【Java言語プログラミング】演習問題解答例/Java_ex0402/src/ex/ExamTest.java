/*
 * Java_ex0402
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
		Examinee examinee = new Examinee("田中一郎", 62, "B");
		examinee.showInfo();
	}
}