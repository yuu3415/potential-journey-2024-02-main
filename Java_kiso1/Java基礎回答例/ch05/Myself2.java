package ch05;

class Myself2 {
	 
	public static void main(String[] args) {
		introduce("河村裕貴");
	}
	
	/**
	 * 名前を用いて自己紹介文を表示する
	 * @param name 名前
	 */
	static void introduce(String name) {
		System.out.println("私の名前は" + name + "です。");
	}
}
