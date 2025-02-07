/*
 * Java_t-ex03
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
	 * 指定された顧客名を使用して、
	 * 新しいCustomerオブジェクトを構築します。
	 * @param name 顧客名
	 */
	public Customer(String name) {
		this.name = name;
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
		printMyCart();
		System.out.println("********************************************");
	}
}
