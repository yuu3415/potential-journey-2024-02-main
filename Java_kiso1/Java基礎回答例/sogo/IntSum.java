package sogo;

class IntSum {
	 
	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		
		int result = sumLoop(min, max);
		
		System.out.println("最小値：" + min);
		System.out.println("最大値：" + max);
		System.out.println("乗算結果：" + result);
	}
	
	/**
	 * 最小値から最大値までの整数を加算した値を返す
	 * @param min 最小値
	 * @param max 最大値
	 * @return 加算結果
	 */
	static int sumLoop(int min, int max) {
		
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}

		return sum;
	}
}
