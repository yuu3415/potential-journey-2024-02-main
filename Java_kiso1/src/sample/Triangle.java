package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Triangle {
	public static void main(String[] args) {
		double width = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);

		double value = width * height / 2;

		System.out.println("底辺" + width + "、高さ" + height + "の三角形の面積：" + value);
	}
}
