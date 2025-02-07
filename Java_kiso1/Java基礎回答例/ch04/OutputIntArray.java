package ch04;

class OutputIntArray {

	public static void main(String[] args) {
		// 整数列の配列
		int[] intArray = new int[100];

		// 配列の要素に値を代入する
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}

		// 出力する
		System.out.print("配列の要素：");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
}
