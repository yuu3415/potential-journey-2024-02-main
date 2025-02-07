package ch05;

class Circle1 {

	public static void main(String[] args) {
		int radius = 3;
		System.out.print("半径" + radius + "の円の面積：");
		System.out.print(radius * radius * getPi());
	}

	/**
	 * 円周率を返す
	 * @return 円周率
	 */
	static double getPi() {
		return 3.141592653589793;
	}
}
