/*
 * Java_t-ex01
 * shopping.Main.java
 */
package shopping;

/**
 * 買い物システムの操作を行うクラスです。
 * @author Yuki Kawamura
 */
public class Main {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		// ショップを作成
		Shop shop = new Shop("カーショップ ジョイ");

		// 取り扱い商品を追加
		shop.add(new Item("フリウス", 2350000));
		shop.add(new Item("バリヤー", 2970000));
		shop.add(new Item("ベルグランド", 3150000));
		shop.add(new Item("フォーレディーＺ", 3980000));
		shop.add(new Item("ガニメデ", 2620000));

		// ショップ名と商品を表示
		shop.print();

	}
}
