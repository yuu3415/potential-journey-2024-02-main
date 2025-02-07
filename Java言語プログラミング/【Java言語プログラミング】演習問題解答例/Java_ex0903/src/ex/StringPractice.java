/**
 * Java_ex0903
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
		String str = "Welcome to Java World!";

		String searchStr = args[0];

		int index = str.indexOf(searchStr);

		System.out.print("検索文字列『" + searchStr + "』が、");
		if (0 <= index) {
			System.out.println("文字列のインデックス番号" + index + "に見つかりました。");
		} else {
			System.out.println("文字列に見つかりませんでした。");
		}
	}

}
