package ch03;

class OutputMyData {
	
	public static void main(String[] args) {
		String name;	// 名前
		int age;	 	// 年齢

		// 値を代入する
		name = "河村裕貴";
		age = 30;

		// 1文で表示を行う場合
		System.out.println("名前：" + name + " 年齢：" + age);

		// 複数文で表示を行う場合
		/*
		System.out.print("名前：" + name);
		System.out.print(" ");
		System.out.println("年齢：" + age);
		*/
	}
}
