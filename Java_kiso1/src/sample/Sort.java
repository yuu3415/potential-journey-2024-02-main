package sample;

import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class Sort {
	public static void main(String[] args) {
		int[] value = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("数字を5つ入力してください。");

		value[0] = sc.nextInt();
		value[1] = sc.nextInt();
		value[2] = sc.nextInt();
		value[3] = sc.nextInt();
		value[4] = sc.nextInt();

		System.out.println("並び替え後");

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length - 1; j++) {
				if (value[j] > value[j + 1]) {
					int kari = value[j] - value[j + 1];
					value[j] = value[j] - kari;
					value[j + 1] = value[j + 1] + kari;
				}
			}
		}
		for (int k = 0; k < value.length; k++) {
			System.out.println(value[k] + " ");
		}
	}
}
