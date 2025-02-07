/*
 * Java_ex0906
 * ex.ListPractice.java
 */
package ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Listを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class ListPractice {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		// Listオブジェクトを生成
		List<Integer> list = new ArrayList<Integer>();

		// 要素を追加
		list.add(7);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(9);

		System.out.print("すべての要素を先頭から表示：");
		for(Integer i  : list) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("すべての要素を最後尾から表示：");
		for(int i = list.size(); i > 0 ; i--) {
			System.out.print(list.get(i-1) + " ");
		}

	}
}