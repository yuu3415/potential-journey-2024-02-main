/**
 * Java_ex0904
 * ex.MathPractice.java
 */
package ex;

/**
 * Mathクラスを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class MathPractice {
	/**
	 * メインメソッド
	 * @param args 検索文字列
	 */
	public static void main(String[] args) {

		System.out.println("1-100の範囲のランダム値を10個表示します。");

		int randomValue;

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "個目：");
			randomValue = (int) (Math.random() * 100) + 1;
			System.out.println(randomValue);
		}
	}
}
