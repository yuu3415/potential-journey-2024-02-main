/*
 * Java_ex0804
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
	 * @param args 割られる数 割る数
	 */
	public static void main(String[] args) {

		try {
			int value = Integer.parseInt(args[0]);
			int by = Integer.parseInt(args[1]);

			int result = divide(value, by);
			System.out.println("計算結果：" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException |  ArithmeticException e) {

			System.out.println(e);
		}

		System.out.println("プログラムを終了します");
	}

	/**
	 * valueをbyで割った計算結果を返します。
	 * @param value 割られる数
	 * @param by 割る数
	 * @return 計算結果
	 * @throws ArithmeticException byの値が0だった場合
	 */
	static int divide(int value, int by) throws ArithmeticException {
		System.out.println("divideメソッドを実行します");
		int result = value / by;
		return result;
	}


}