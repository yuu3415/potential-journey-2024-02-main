package sogo;

public class SelectSort {

	public static void main(String[] args) {

		int[] buf = new int[10];

		for (int i = 0; i < buf.length; i++) {
			int random = (int) (Math.random() * 100) - 50;
			buf[i] = random;

		}

		for (int i = 0; i < buf.length - 1; i++) {
			// s番目以降の最小値がどこにあるか探す
			int min_pointer = i; // 最小値の場所（とりあえずs番目を最小とみなす）
			for (int j = i + 1; j < buf.length; j++) {
				if (buf[j] < buf[min_pointer]) {
					min_pointer = j;
				}
			}

			// s番目とmin_pointer番目を交換する
			int temp = buf[i];
			buf[i] = buf[min_pointer];
			buf[min_pointer] = temp;

		}

		for (int i = 0; i < buf.length; i++) {
			int j = buf[i];
			System.out.println(j);

		}
	}

}
