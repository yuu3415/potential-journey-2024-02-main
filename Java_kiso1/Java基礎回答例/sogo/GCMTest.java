package sogo;

class GCMTest {
	 
	public static void main(String[] args) {
		int a;
		int b;
		a = 3108;
		b = 1665;

		// メソッドにaとbを渡して呼び出し
		// 最大公約数を計算した結果をgcmに代入
		int gcm = getGcm(a, b);

		System.out.print(" " + a + "と" + b + "の最大公約数：");
		System.out.println(gcm);
	}

	/**
	 * getGcmメソッド : ２つの整数の最大公約数を返す
	 * ユークリッドの互除法による
	 * @param x 入力値
	 * @param y 入力値
	 * @return 最大公約数
	 */
	static int getGcm(int x, int y) {
		int r;

		while ((r = x % y) != 0) {
			x = y;
			y = r;
		}
		return y;
	}
}
