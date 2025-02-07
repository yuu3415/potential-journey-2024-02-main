/**
 * Java_ex0902
 * ex.StringPractice.java
 */
package ex;

/**
 * Stringを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class StringPractice {
	/**
	 * メインメソッド
	 * @param args 検索文字列
	 */
	public static void main(String[] args) {
		String[] fruits = { "orange", "banana", "lemon", "apple", "peach" };

		String searchStr = args[0];
		int index = -1;

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(searchStr)) {
				index = i;
			}
		}

		System.out.print("検索文字列『" + searchStr + "』が、");
		if (0 <= index) {
			System.out.println("配列のインデックス番号" + index + "に見つかりました。");
		} else {
			System.out.println("配列中に見つかりませんでした。");
		}
	}
}
