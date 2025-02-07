package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class GCMTest {
	public static void main(String[] args) {
		int a = 3108;
		int b = 1665;
		int result = getGcm(a, b);

		System.out.println(a + "と" + b + "の最大公約数：" + result);
	}

	static int getGcm(int a, int b) {
		int result = 0;

		if (a >= b) {
			for (int i = a; i > 0; i--) { // for文の条件はtrueの時処理が行われ、falseの時for文を抜ける
				if (a % i == 0) {

					if (b % i == 0) {
						result = i;
						break;
					}
				}
			}
		} else if (b > a) {
			for (int i = b; i > 0; i--) {

				if (b % i == 0) {

					if (a % i == 0) {
						result = i;
						break;
					}
				}
			}
		}
		return result;
	}
}