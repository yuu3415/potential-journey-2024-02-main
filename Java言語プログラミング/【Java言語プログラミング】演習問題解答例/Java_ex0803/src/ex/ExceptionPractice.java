/*
 * Java_ex0803
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
	 * @param args 表示する配列要素のインデックス番号
	 */
	public static void main(String[] args) {

		int[] intArray = { 10, 25, 4, 67, 100 };

		try {
			int index = Integer.parseInt(args[0]);
			System.out.println("指定された配列の要素：" + intArray[index]);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("プログラムを終了します");
	}
}
