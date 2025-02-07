package shopping;

public class Customer {
	private String name;
	private Cart myCart = new Cart();
	private int money;

	public Customer(String name) {
		this.name = name;
	}

	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void add(Shop shop, int itemNo) {
		shop.get(itemNo);

		myCart.add(shop.get(itemNo));
	}

	public void remove(int itemNo) {
		myCart.remove(itemNo);
	}

	public void checkOut() {
		int totalPrice = myCart.getTotalPrice();

		if (totalPrice <= money) {
			money = money - totalPrice;
			myCart.clear();
		} else {
			System.out.println("清算不可：所持金が不足しています。");
		}

	}

	public void printMyCart() {
		myCart.print();
	}

	public void print() {
		System.out.println("******************************");
		System.out.println("私の名前は、" + name + "です。");
		System.out.println("所持金は、" + money + "円です。");
		myCart.print();

		System.out.println("******************************");

	}
}
