package shopping;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private String name;
	private List<Item> listItem=new ArrayList<Item>();
	
	public Shop(String name) {
		this.name=name;
	}
	
	public void add(Item item) {
		listItem.add(item);
	}
	
	public void print() {
		System.out.println("=============================");
		System.out.println("いらっしゃいませ！"+name+"へようこそ。");
		System.out.println("【取扱商品】");
		for (int i = 0; i <listItem.size(); i++) {
			System.out.print(i+" ");
			listItem.get(i).print();
		}
		System.out.println("=============================");
	}
}
