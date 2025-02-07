package shopping;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		Shop shop = new Shop("茅ヶ崎ショップ");

		shop.add(new Item("フリウス", 2350000));
		shop.add(new Item("バリヤー", 2970000));
		shop.add(new Item("ベルグランド", 3150000));
		shop.add(new Item("フォーレディーZ", 3980000));
		shop.add(new Item("ガニメデ", 2620000));

		shop.print();

		Customer customer = new Customer("田中", 20000000);

		customer.print();

		System.out.println("購入したい商品を選んでください");

		for (;;) {
			try {

				Scanner scan = new Scanner(System.in);

				System.out.print("商品番号（qで買い物を終了/cでカートの中身を表示/rで返品）？");

				String str = scan.next();

				if (str.equals("q")) {
					break;
				} else if (str.equals("c")) {
					customer.printMyCart();
				} else if (str.equals("r")) {
					System.out.println("■□■□■現在返品モードです。■□■□■");

					customer.printMyCart();
					for (;;) {
						try {

							Scanner scan1 = new Scanner(System.in);

							System.out.print("返品する商品番号（qで返品を終了）？");

							String str1 = scan1.next();

							if (str1.equals("q")) {
								System.out.println("■□■□■返品モードを解除しました。■□■□■");
								break;
							}

							int number1 = Integer.parseInt(str1);

							customer.remove(number1);

							customer.printMyCart();

						} catch (NumberFormatException e) {
							System.out.println("数値または指定の文字列を入力してください。");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("指定された商品番号に該当する商品はカート内にありません。");
						}

					}

				}
				int number = Integer.parseInt(str); // コードの量が増えていくほどに{}の位置に気をつける。処理が届いていない場合もある。

				customer.add(shop, number);

			} catch (NumberFormatException e) {
				System.out.println("数値または文字列を入力してください。"); // エラーメッセージが表示されなくなってしまった
			} catch (IndexOutOfBoundsException e) {

				System.out.println("指定された商品番号に該当する商品は商品リストにありません。"); // 固有の返したい文字列をsysoutで出す。教材と行い方が少し違うがこれで大丈夫？
			}
		}
		customer.printMyCart();

		customer.checkOut();
		customer.print();

	}

//	static int judge(String str) throws NumberFormatException {
//
//		if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") // 数字を含むときは通すようにしたがこれでは振いのかけ方が雑すぎる気がする…
//				|| str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")
//				|| str.contains("0")) {
//		} else {
//
//			String errMsg = "数値または指定の文字を入力してください。";
//			NumberFormatException nfe = new NumberFormatException(errMsg);
//			throw nfe;
//
//		}
//		int number = Integer.parseInt(str);
//		return number;

}
