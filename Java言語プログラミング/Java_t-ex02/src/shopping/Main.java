package shopping;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Shop shop=new Shop("茅ヶ崎ショップ");
		
		
		shop.add(new Item("フリウス", 2350000));
		shop.add(new Item("バリヤー", 2970000));
		shop.add(new Item("ベルグランド", 3150000));
		shop.add(new Item("フォーレディーZ", 3980000));
		shop.add(new Item("ガニメデ", 2620000));
		
		
		shop.print();
		
		Customer customer=new Customer("田中");
		
		customer.print();
		
		customer.add(shop, 0);
		
		customer.add(shop, 3);
		
		customer.printMyCart();


	}

}
