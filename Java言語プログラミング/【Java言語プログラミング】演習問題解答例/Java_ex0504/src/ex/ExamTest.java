/*
 * Java_ex0504
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

		Examinee examinee1 = new Examinee("畑山楓", 51, "A");
		examinee1.showInfo();
		examinee1.showJudge();
		System.out.println();

		Examinee examinee2 = new Examinee("高田昇", 28);
		examinee2.showInfo();
		examinee2.showJudge();
	}
}