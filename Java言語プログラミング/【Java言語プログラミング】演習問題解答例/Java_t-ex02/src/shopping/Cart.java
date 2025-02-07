/*
 * Java_t-ex02
 * shopping.Cart.java
 */
package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * カートを表すクラスです。
 * @author Yuki Kawamura
 */
public class Cart {
	/**
	 * カートに入っている商品のリスト
	 */
	private List<Item> listItem = new ArrayList<Item>();

	/**
	 * カートに商品を追加する
	 * @param item 追加商品
	 */
	public void add(Item item) {
		listItem.add(item);
	}

	/**
	 * カート内の商品の合計価格を取得する
	 * @return 合計金額
	 */
	public int getTotalPrice() {
		int total = 0;
		for (Item item : listItem) {
			total += item.getPrice();
		}
		return total;
	}

	/**
	 * カート内の商品情報を表示する
	 */
	public void print() {
		System.out.println("【カート内の商品】");

		if (!(listItem.size() == 0)) {
			for (int i = 0; i < listItem.size(); i++) {
				System.out.print(i + " : ");
				listItem.get(i).print();
			}
			System.out.println("カート内の商品の合計価格：" + getTotalPrice() + "円");

		} else {
			System.out.println("カートに商品が入っていません。");
		}
	}
}
