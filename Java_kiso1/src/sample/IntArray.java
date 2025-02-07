package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/19
 */
public class IntArray {
		public static void main(String[] args) {
			int[] array =new int[5];
			array[0]=10;
			array[1]=20;
			array[2]=30;
			array[3]=40;
			array[4]=50;
			
			System.out.println("先頭の要素："+array[0]);
			System.out.println("最後尾の要素："+array[4]);
			System.out.println("要素数："+array.length);
		}

}
