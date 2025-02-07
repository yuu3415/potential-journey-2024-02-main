package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class SearchNumber1 { 
	public static void main(String[] args) {
		int[] array= {2,3,5,7,11,13,17,19};
		int value=19;
		
		for (int i = 0; i < array.length; i++) {
			if (value==array[i]) {
				System.out.println(value+"が見つかりました。");
				
			}
		}
	}

}
