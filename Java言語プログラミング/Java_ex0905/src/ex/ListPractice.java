package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("りんご");
		fruitsList.add("ばなな");
		fruitsList.add("めろん");
		fruitsList.add("みかん");
		fruitsList.add("ぶどう");

		System.out.println("2つ目の要素：" + fruitsList.get(1));
		System.out.println("2つ目の要素：" + fruitsList.get(4));
		System.out.println();
		System.out.println();

		System.out.print("すべての要素を先頭から表示：");
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.print(fruitsList.get(i) + " ");

		}
		System.out.println();
		System.out.println("要素を追加（成功すればtrue）：" + fruitsList.add("もも"));

		System.out.print("すべての要素を先頭から表示：");
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.print(fruitsList.get(i) + " ");
		}
		System.out.println();

		System.out.println("要素を削除：" + fruitsList.get(2));
		fruitsList.remove(3);

		System.out.print("すべての要素を先頭から表示：");
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.print(fruitsList.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("特定の位置に要素を追加");
		fruitsList.add(1, "びわ");
		
		System.out.print("すべての要素を先頭から表示：");
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.print(fruitsList.get(i) + " ");
		}

	}
}
