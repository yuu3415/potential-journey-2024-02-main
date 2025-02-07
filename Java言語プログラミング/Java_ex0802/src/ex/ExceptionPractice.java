package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class ExceptionPractice {
	public static void main(String[] args) {
		try {
			String str = "ABC";
			int value = Integer.parseInt(str);
			System.out.println("value の二乗:" + (value * value));
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("プログラムを終了します");
		}

	}
}
