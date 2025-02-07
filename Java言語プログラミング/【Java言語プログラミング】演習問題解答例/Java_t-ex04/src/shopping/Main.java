/*
 * Java_t-ex04
 * shopping.Main.java
 */
package shopping;

import java.util.Scanner;

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

		// 顧客を作成
		Customer customer = new Customer("田中", 20000000);

		// 顧客情報を表示
		customer.print();

		// 購入商品の選択
		System.out.println("購入したい商品を選んでください。");
		Scanner scan = new Scanner(System.in);
		String str;

		while (true) {
			System.out.print("商品番号（qで買物を終了）？");
			str = scan.nextLine();

			// "q"の入力で買物を終了
			if (str.equals("q")) {
				break;
			}

			// 商品の購入
			try {
				int itemNo = Integer.parseInt(str);
				customer.add(shop, itemNo);
			} catch (NumberFormatException e) {
				System.out.println("数値または指定の文字を入力してください。");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("指定された商品番号に該当する商品は商品リストにありません。");
			}
		}

		// カート内の商品を表示
		customer.printMyCart();

		// 商品の精算
		customer.checkOut();

		// 所持金とカート内を表示
		customer.print();
	}
}
