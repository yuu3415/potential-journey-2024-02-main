package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class OutputIntArray {
		public static void main(String[] args) {
			int[] array =new int[100];
			
			System.out.print("配列の要素：");
			
			for (int i = 0; i < array.length; i++) {
				array[i]=i;
				System.out.print(i+" ");
			}
		}

		
}
