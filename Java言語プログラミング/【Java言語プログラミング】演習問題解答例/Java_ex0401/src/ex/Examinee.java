/*
 * Java_ex0401
 * Examinee.java
 */
package ex;

/**
 * 受験者を表すクラスです。
 * @author Yuki Kawamura
 */
public class Examinee {
	/**
	 * 受験者名
	 */
	private String name;

	/**
	 * 筆記試験の得点
	 */
	private int score;

	/**
	 * 実技試験の評価グレード
	 */
	private String grade;

	/**
	 * フィールドnameの値を返します。
	 * @return 受験者名
	 */
	public String getName() {
		return name;
	}

	/**
	 * フィールドnameの値を設定します。
	 * @param name 受験者名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールドscoreの値を返します。
	 * @return 筆記試験の得点
	 */
	public int getScore() {
		return score;
	}

	/**
	 * フィールドscoreの値を設定します。
	 * @param score 筆記試験の得点
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * フィールドgradeの値を返します。
	 * @return 実技試験の評価グレード
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * フィールドgradeの値を設定します。
	 * @param grade 実技試験の評価グレード
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * 受験者情報を表示する
	 */
	void showInfo() {
		System.out.println("■■■受験者情報■■■");
		System.out.println("受験者名：" + name);
		System.out.println("筆記試験：" + score + "点");
		System.out.println("実技試験：" + grade);
	}
}