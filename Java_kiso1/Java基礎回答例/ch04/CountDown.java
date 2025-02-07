package ch04;

class CountDown {
	
	public static void main(String[] args) {

		// 繰り返し処理
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		
		// while文を使った場合
		/*
		int i = 100;
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
		*/
		
		
		// do-while文を使った場合
		/*
		int i = 100;
		do {
			System.out.print(i + " ");
			i--;
		} while(i > 0);
		*/
	}
}
