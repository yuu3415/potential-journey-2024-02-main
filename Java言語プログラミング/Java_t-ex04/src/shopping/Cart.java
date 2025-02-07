package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> listiItem = new ArrayList<Item>();

	public void add(Item item) {
		listiItem.add(item);
	}
	
	public void clear() {
		listiItem.clear();
	}

	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < listiItem.size(); i++) {
			sum += listiItem.get(i).getPrice();
		}
		return sum;
	}

	public void print() {
		if (listiItem.size() == 0) {
			System.out.println("【カート内の商品】");
			System.out.println("カートに商品が入っていません。");
		} else {
			System.out.println("【カート内の商品】");
			for (int i = 0; i < listiItem.size(); i++) {
				System.out.print(i + " ");
				listiItem.get(i).print();

			}
			System.out.println("カート内の商品の合計価格：" + getTotalPrice());
		}
	}
}
