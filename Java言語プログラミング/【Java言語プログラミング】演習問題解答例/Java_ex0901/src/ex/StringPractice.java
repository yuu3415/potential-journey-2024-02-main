/**
 * Java_ex0901
 * ex.StringPractice.java
 */
package ex;

/**
 * Stringを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class StringPractice {
	/**
	 * メインメソッド
	 * @param args 一つ目の文字列 二つ目の文字列
	 */
	public static void main(String[] args) {

		String strVal1 = args[0];
		String strVal2 = args[1];

		System.out.println("一つ目の文字列：" + strVal1);
		System.out.println("二つ目の文字列：" + strVal2);

		if (strVal1.equals(strVal2)) {
			System.out.println("二つの文字列は等しい。");
		} else {
			System.out.println("二つの文字列は等しくない。");
		}
	}
}
