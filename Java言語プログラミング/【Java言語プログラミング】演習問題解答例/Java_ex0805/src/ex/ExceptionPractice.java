/*
 * Java_ex0805
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
		byte num1 = 80;
		byte num2 = 50;

		try {
			byte result = add(num1, num2);
			System.out.println("計算結果：" + result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("プログラムを終了します");
	}

	/**
	 * 二つのbyte型整数の合計を返します。
	 * 結果がbyteの範囲を超える場合、例外をスローします。
	 * @param num1 一つ目の値
	 * @param num2 二つ目の値
	 * @return 二つのbyte型整数の合計値
	 * @throws ArithmeticException 結果がbyteの範囲を超える場合
	 */
	static byte add(byte num1, byte num2) throws ArithmeticException {

		int result = num1 + num2;

		if(result < -128 || 127 < result) {
			throw new ArithmeticException("計算結果がbyteの範囲を超えています");
		}

		return (byte)result;
	}
}
