/*
 * Java_t-ex04
 * shopping.Customer.java
 */
package shopping;

/**
 * 顧客を表すクラスです。
 * @author Yuki Kawamura
 */
public class Customer {

	/**
	 * 顧客名
	 */
	private String name;

	/**
	 * カート
	 */
	private Cart myCart = new Cart();

	/**
	 * 所持金
	 */
	private int money;

	/**
	 * 指定された顧客名を使用して、
	 * 新しいCustomerオブジェクトを構築します。
	 * @param name 顧客名
	 */
	public Customer(String name) {
		this.name = name;
	}

	/**
	 * 指定された顧客名と所持金を使用して、
	 * 新しいCustomerオブジェクトを構築します。
	 * @param name 顧客名
	 * @param money 所持金
	 */
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	/**
	 * カートに商品を追加する
	 * @param shop ショップ
	 * @param itemNo 商品番号
	 */
	public void add(Shop shop, int itemNo) {
		myCart.add(shop.get(itemNo));
	}

	/**
	 * カート内の商品を精算する
	 */
	public void checkOut() {

		int totalPrice = myCart.getTotalPrice();
		if (totalPrice <= money) {
			money -= totalPrice;
			myCart.clear();
		} else {
			System.out.println("精算不可：所持金が不足しています。");
		}
	}

	/**
	 * カート内の情報を表示する
	 */
	public void printMyCart() {
		myCart.print();
	}

	/**
	 * 顧客情報を表示する
	 */
	public void print() {
		System.out.println("********************************************");
		System.out.println("私の名前は、" + name + "です。");
		System.out.println("所持金は、" + money + "円です。");
		printMyCart();
		System.out.println("********************************************");
	}
}
