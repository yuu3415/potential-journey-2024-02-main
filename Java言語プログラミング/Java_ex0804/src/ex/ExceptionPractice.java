package ex;

public class ExceptionPractice {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt(args[0]);
			int by = Integer.parseInt(args[1]);
			int result = divide(value, by);
			System.out.println("計算結果：" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("プログラムを終了します");
		}
	}

	/**
	 * value を by で割った計算結果を返します。
	 * 
	 * @param value 割られる数
	 * @param by    割る数
	 * @return 計算結果
	 * @throws ArithmeticException by の値が 0 だった場合
	 */
	static int divide(int value, int by) throws ArithmeticException {
		System.out.println("divide メソッドを実行します");
		int result = value / by;
		return result;
	}
}
