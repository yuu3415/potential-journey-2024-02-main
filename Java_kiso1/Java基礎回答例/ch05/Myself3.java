package ch05;

class Myself3 {
	 
	public static void main(String[] args) {
		introduce("ジョニーデップ", 10);
	}
	
	/**
	 * 名前と年齢を用いて自己紹介文を表示する
	 * @param name 名前
	 * @param age 年齢
	 */
	static void introduce(String name, int age) {
		System.out.print("私の名前は" + name);
		System.out.print("、年齢は" + age + "歳です。");
	}
}
