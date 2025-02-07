package sogo;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int[] sort = new int[5]; // 並び替えを行う配列
		int change = 0; // 並び替えをおこなう為の変数

		System.out.println("数字を5つ入力してください。");

		Scanner sc = new Scanner(System.in);

		sort[0] = Integer.parseInt(sc.next());
		sort[1] = Integer.parseInt(sc.next());
		sort[2] = Integer.parseInt(sc.next());
		sort[3] = Integer.parseInt(sc.next());
		sort[4] = Integer.parseInt(sc.next());

		// 入れ替えの二重ループ
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				if (sort[j] > sort[j + 1]) {
					change = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = change;
				}
			}
		}
		System.out.println("並び替え後");

		// 並び替え後の表示
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
	}
}
