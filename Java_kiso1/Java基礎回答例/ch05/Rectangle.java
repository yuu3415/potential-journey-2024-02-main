package ch05;

class Rectangle {

	public static void main(String[] args) {

		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);

		System.out.print("幅" + width + "、");
		System.out.print("高さ" + height + "の長方形の面積：");
		System.out.print(width * height);
	}
}
