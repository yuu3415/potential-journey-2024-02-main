package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Circle2 {
	public static void main(String[] args) {
		String result = getCircleArea(3.0);
		System.out.println(result);
	}

	static String getCircleArea(double value) {
		double circle = value * value * 3.14;
		String result = ("半径" + value + "の円の面積：" + circle);
		return result;
	}
}
