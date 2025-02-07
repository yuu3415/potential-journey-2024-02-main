/*
 * Java_ex0502
 * ExamTest.java
 */
package ex;

/**
 * Examinee、Examinationのテストクラスです。
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

		int score = examinee.getScore();
		String grade = examinee.getGrade();

		String writtenResult = Examination.judge(score);
		String practicalResult = Examination.judge(grade);
		String totalResult = Examination.judge(score, grade);

		System.out.println(writtenResult);
		System.out.println(practicalResult);
		System.out.println(totalResult);
	}
}