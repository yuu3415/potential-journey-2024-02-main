package ch05;

class Arithmetic1 {
	 
	public static void main(String[] args) {
		int value1 = 61;
		int value2 = 46;
		
		int result = multiply(value1, value2);
		
		System.out.println("1つ目の整数：" + value1);
		System.out.println("2つ目の整数：" + value2);
		System.out.println("乗算結果：" + result);
	}
	
	/**
	 * ２つの引数の乗算結果を返す
	 * @param x 最初の値
	 * @param y 2番目の値
	 * @return 乗算結果
	 */
	static int multiply(int x, int y) {
		return x * y;
	}
}
