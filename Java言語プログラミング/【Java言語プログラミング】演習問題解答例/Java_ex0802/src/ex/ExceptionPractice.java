/*
 * Java_ex0802
 * ex.ExceptionPractice.java
 */
package ex;

/**
 * 例外処理の練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class ExceptionPractice {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {
		String str = "ABC";

		try {
			int value = Integer.parseInt(str);
			System.out.println("valueの二乗:" + (value * value));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		System.out.println("プログラムを終了します");
	}
}