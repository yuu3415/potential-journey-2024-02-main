/*
 * Java_ex0302
 * ExamTest.java
 */

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
		Examinee examinee1 = new Examinee();
		examinee1.name = "浜田南";
		examinee1.score = 83;
		examinee1.grade = "B";

		Examinee examinee2 = new Examinee();
		examinee2.name = "上田翔平";
		examinee2.score = 48;
		examinee2.grade = "A";

		examinee1.showInfo();
		System.out.println();

		examinee2.showInfo();
	}
}
