package shopping;

public class Customer {
	private String name;
	private Cart myCart=new Cart();
	
	public Customer(String name) {
		this.name=name;
	}

	public void add(Shop shop,int itemNo) {
		shop.get(itemNo);
		
		myCart.add(shop.get(itemNo));
	}
	
	public void printMyCart() {
		myCart.print();
	}
	public void print() {
		System.out.println("******************************");
		System.out.println("私の名前は、"+name+"です。");
		myCart.print();
		
		System.out.println("******************************");

	}
}
