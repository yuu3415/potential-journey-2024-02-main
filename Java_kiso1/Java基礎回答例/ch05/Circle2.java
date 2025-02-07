package ch05;

class Circle2 {

	public static void main(String[] args) {
		double radius = 3.0;
		System.out.print("半径" + radius + "の円の面積：");
		System.out.print(getCircleArea(radius));
	}

	/**
	 * 半径を元に円の面積を返す
	 * @param radius 円の半径
	 * @return 円の面積
	 */
	static double getCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
