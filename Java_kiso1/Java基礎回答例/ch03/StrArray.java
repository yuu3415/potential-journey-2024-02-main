package ch03;

class StrArray {

	public static void main(String[] args) {
		// 文字列型の配列を定義
				String[] strAry = new String[5];

				// 値を代入する
				strAry[0] = "one";
				strAry[1] = "two";
				strAry[2] = "three";
				strAry[3] = "four";
				strAry[4] = "five";
				
				// 配列の初期化子を使った場合
//				String[] strAry = {"one", "two", "three", "four", "five"};

				// 値を表示する
				System.out.println(strAry[0] + ", " + strAry[1] + ", " 
					+ strAry[2] + ", " + strAry[3] + ", " + strAry[4]);
	}
}
