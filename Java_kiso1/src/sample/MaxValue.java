package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class MaxValue {
	public static void main(String[] args) {
		int[] array = { 3, 19, 25, 12, 22, 9, 5, 15, 7, 12 };
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大値：" + max);
	}
}