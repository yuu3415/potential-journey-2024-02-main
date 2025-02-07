package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		List<Integer> valueList = new ArrayList<Integer>();

		valueList.add(7);
		valueList.add(2);
		valueList.add(5);
		valueList.add(3);
		valueList.add(9);

		System.out.print("すべての要素を先頭から表示：");
		for (int i = 0; i < valueList.size(); i++) {
			System.out.print(valueList.get(i) + " ");
		}
		System.out.println();

		System.out.print("すべての要素を最後尾から表示：");
		for (int i =valueList.size()-1; i >= 0; i--) {
			System.out.print(valueList.get(i) + " ");
		}

	}
}
