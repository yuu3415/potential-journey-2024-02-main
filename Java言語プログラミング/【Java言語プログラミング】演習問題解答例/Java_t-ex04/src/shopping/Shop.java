/*
 * Java_t-ex04
 * shopping.Shop.java
 */
package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * ショップを表すクラスです。
 * @author Yuki Kawamura
 */
public class Shop {
	/**
	 * ショップ名
	 */
	private String name;

	/**
	 * 商品リスト
	 */
	private List<Item> listItem = new ArrayList<Item>();

	/**
	 * 指定されたショップ名を使用して、
	 * 新しいShopオブジェクトを構築する。
	 * @param name ショップ名
	 */
	public Shop(String name) {
		this.name = name;
	}

	/**
	 * 商品を商品リストに追加する
	 * @param item 商品
	 */
	public void add(Item item) {
		listItem.add(item);
	}
	/**
	 * 指定された商品番号に該当する商品を返します。
	 * @param itemNo 商品番号
	 * @return 商品
	 */
	public Item get(int itemNo) {
		return listItem.get(itemNo);

	}

	/**
	 * ショップ名と商品を表示する
	 */
	public void print() {
		System.out.println("======================================================");
		System.out.println("いらっしゃいませ！" + name + "へようこそ。");
		System.out.println("【取扱商品】");

		for (int i = 0; i < listItem.size(); i++) {
			Item item = listItem.get(i);
			System.out.print(i + "　");
			item.print();
		}
		System.out.println("======================================================");
	}
}
