package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/27
 */
public class StringPractice {
	public static void main(String[] args) {
		String[] fruits = { "orange", "banana", "lemon", "apple", "peach" };
		
		boolean result=false;

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(args[0])) {
				System.out.println("検索文字列『" + args[0] + "』が、配列のインデックス番号" + i + "に見つかりました。");
				result=true;
			}
		}
		if (result==false) {
			System.out.println("検索文字列『" + args[0] + "』が、配列中に見つかりませんでした。");
		}

	}
}
