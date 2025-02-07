package sogo;

class RandomTest {

	public static void main(String[] args) {

		int count = Integer.parseInt(args[0]);

		// 乱数を生成して表示
		for (int i = 1; i <= count; i++) {
			int random = (int) (Math.random() * 10);
			System.out.println(i + "回目:" + random);
		}
	}
}
