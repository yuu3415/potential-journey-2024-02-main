package ex;

public class ExceptionPractice {
	public static void main(String[] args) {
		try {
			int[] intArray = { 10, 25, 4, 67, 100 };
			int index = 10;
			System.out.println("指定された配列の要素：" + intArray[index]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);

		} finally {
			System.out.println("プログラムを終了します");
		}

	}
}