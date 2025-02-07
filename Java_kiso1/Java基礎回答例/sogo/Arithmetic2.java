package sogo;

class Arithmetic2 {
	 
	public static void main(String[] args) {
		int firstTerm = 1;
		int tolerance = 4;
		int arity = 5;
		
		int[] suretsu = getProgression(firstTerm, tolerance, arity);
		
		System.out.print("初項 = " + firstTerm);
		System.out.print(", 公差 = " + tolerance);
		System.out.println(", 項数 = " + arity);
		
		System.out.print("等差数列：");
		for (int i = 0; i < suretsu.length; i++) {
			System.out.print(suretsu[i] + " ");
		}
	}
	
	/**
	 * 引数で指定された初項、公差、項数の等差数列を返す
	 * @param firstTerm 初項
	 * @param tolerance 公差
	 * @param arity 項数
	 * @return 等差数列を示す配列
	 */
	static int[] getProgression(int firstTerm, int tolerance, int arity) {
		
		int[] suretsu = new int[arity];

		// 等差数列を配列に格納
		suretsu[0] = firstTerm;
		for (int i = 1; i < suretsu.length; i++) {
			suretsu[i] = suretsu[i - 1] + tolerance;
		}

		return suretsu;
	}
}
