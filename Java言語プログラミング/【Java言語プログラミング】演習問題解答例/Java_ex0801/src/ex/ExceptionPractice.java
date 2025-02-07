/*
 * Java_ex0801
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

		int[] intArray = { 10, 25, 4, 67, 100 };
		int index = 10;

		try {
			System.out.println("指定された配列の要素：" + intArray[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("プログラムを終了します");
	}
}
