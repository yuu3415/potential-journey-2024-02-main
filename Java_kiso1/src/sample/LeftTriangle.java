package sample;

import java.util.Iterator;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class LeftTriangle {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.println();
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
		}
	}

}
