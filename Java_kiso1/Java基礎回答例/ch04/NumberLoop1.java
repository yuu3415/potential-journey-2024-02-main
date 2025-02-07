package ch04;

class NumberLoop1 {

	public static void main(String[] args) {
		// 繰り返し処理
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		// while文を使った場合
		/*
		int i = 0;
		while (i < 100) {
			System.out.println(i);
			i++;
		}
		*/

		// do-while文を使った場合
		/*
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < 100);
		*/
	}
}
