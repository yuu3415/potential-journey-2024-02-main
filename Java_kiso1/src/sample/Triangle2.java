package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class Triangle2 {
	public static void main(String[] args) {
		drawTriangle(7);
	}

	static void drawTriangle(int height) {
		for (int i = 0; i < height; i++) {
			System.out.println();
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
		}
	}
}
