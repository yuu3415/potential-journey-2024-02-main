package ch04;

class MultipleLoop {
	 
	public static void main(String[] args) {
		int num = 19; // 倍数の値
		int cnt = 0; // カウンタ

		System.out.println("◇ 500以下の19の倍数");
		while (num <= 500) {
			System.out.print(num + " ");
			cnt++;
			num += 19;
		}

		System.out.println();
		System.out.println("個数は、" + cnt + "個");
	}
}
