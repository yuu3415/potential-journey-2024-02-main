/*
 * Java_ex0905
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
		List<String> list = new ArrayList<String>();

		// 要素を追加
		list.add("りんご");
		list.add("ばなな");
		list.add("めろん");
		list.add("みかん");
		list.add("ぶどう");

		// 特定の要素を表示
		System.out.println("２つ目の要素："+list.get(1));
		System.out.println("５つ目の要素："+list.get(4));

		System.out.println();

		System.out.print("すべての要素を先頭から表示：");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();


		// 要素を追加
		System.out.println("要素を追加（成功すればtrue）：" + list.add("もも"));

		System.out.print("すべての要素を先頭から表示：");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// 要素を削除
		System.out.println("要素を削除：" + list.remove(2));

		System.out.print("すべての要素を先頭から表示：");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// 特定の位置に要素を追加
		System.out.println("特定の位置に要素を追加");
		list.add(1, "びわ");

		System.out.print("すべての要素を先頭から表示：");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
