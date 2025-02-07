package ch04;

class OddNumberLoop {
 
	public static void main(String[] args) {

		System.out.println("◇ 50以下の奇数");

		// 奇数を表示する為、1から開始し、2ずつカウントアップ
		for (int i = 1; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		
	}
}
