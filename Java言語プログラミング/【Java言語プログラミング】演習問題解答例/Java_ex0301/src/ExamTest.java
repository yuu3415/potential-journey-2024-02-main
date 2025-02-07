/*
 * Java_ex0301
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
		Examinee examinee = new Examinee();
		examinee.name = "山田太郎";
		examinee.score = 70;
		examinee.grade = "A";
		examinee.showInfo();
	}
}

