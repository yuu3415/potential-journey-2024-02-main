package ch03;

class OutputFloatData {
	
	public static void main(String[] args) {
		float f; // float型変数

		// 値を代入する
		f = 123.456f;

		// float型の値を、int型に代入する
		int i = (int) f;

		// 変数の値を表示する
		System.out.println("i：" + i);
	}
}
