package ch04;

class OutputStringArray {

	public static void main(String[] args) {
		// 文字列の配列
		String[] str = { "apple", "orange", "melon", "peach", "lemon", "grape" };

		// 出力する
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
