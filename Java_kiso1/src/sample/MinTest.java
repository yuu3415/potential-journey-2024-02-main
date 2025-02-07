package sample;

import java.util.Iterator;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class MinTest {
	public static void main(String[] args) {
		int result = minimum(args);

		System.out.print("入力された数値：");

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		System.out.println("配列中の最小値：" + result);

	}

	static int minimum(String[] min) {
		int l = min.length;
		int[] numbers = new int[l];

		for (int i = 0; i < min.length; i++) {
			int kari = Integer.parseInt(min[i]);
			numbers[i] = kari;
		}

		int result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (result > numbers[i]) {
				result = numbers[i];
			}

		}
		return result;
	}
}
