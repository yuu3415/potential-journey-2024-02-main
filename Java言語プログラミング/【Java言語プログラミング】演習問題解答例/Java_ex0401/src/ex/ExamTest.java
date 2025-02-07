/*
 * Java_ex0401
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
		Examinee examinee = new Examinee();
		examinee.setName("林花子");
		examinee.setScore(55);
		examinee.setGrade("A");

		System.out.println("名前は" + examinee.getName() + "、");
		System.out.println("筆記は" + examinee.getScore() + "点、");
		System.out.println("実技は" + examinee.getGrade() + "判定でした。");
	}
}
