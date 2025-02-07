package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class MaxTest {
	public static void main(String[] args) {
		int[] array = { 17, 68, 14, 55, 70, 12, 21, 63, 88, 50 };
		
		int result = max(array);
		
		System.out.print("配列：");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n"+"配列の最大値："+result);
		
	}
	
	static int max(int[] array) {
		int result = array[0];

		for (int i = 1; i < array.length; i++) {
			if (result < array[i]) {
				result = array[i];
			}
		}
		return result;
	}
	
}