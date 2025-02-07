package ch05;

class Triangle1 {

	public static void main(String[] args) {

		double base = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);

		System.out.print("底辺" + base + "、");
		System.out.print("高さ" + height + "の三角形の面積：");
		System.out.print((base * height) / 2);
	}
}
