package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Arithmetic1 {
	public static void main(String[] args) {
		String result = multiply(61, 46);
		System.out.println(result);
	}

	static String multiply(int min, int max) {

		int x = min * max;
		String result = ("1つめの整数：" + min + "\n" + "2つめの整数：" + max + "\n" + "乗算結果：" + x);

		return result;
	}
}
