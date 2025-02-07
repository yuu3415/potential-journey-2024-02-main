package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class RandomTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		random(a);
	}

	static void random(int ram) {

		for (int i = 1; i <= ram; i++) {
			int random = (int) (Math.random() * 10);
			System.out.println(i + "回目：" + random);
		}

	}
}
