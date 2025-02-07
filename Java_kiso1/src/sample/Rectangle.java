package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Rectangle {
	public static void main(String[] args) {
		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int value = width * height;
		System.out.println("幅" + args[0] + "、高さ" + args[1] + "の長方形の面積：" + value);
	}

}
