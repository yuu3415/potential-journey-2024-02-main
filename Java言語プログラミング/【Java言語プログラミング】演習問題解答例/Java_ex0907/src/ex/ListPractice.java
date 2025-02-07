/*
 * Java_ex0907
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
		List<Employee> list = new ArrayList<Employee>();

		// 要素を追加
		list.add(new Employee("佐藤加奈子", "総務部"));
		list.add(new Employee("小林健司", "システム開発部"));
		list.add(new Employee("鈴木直美", "経理部"));
		list.add(new Employee("佐藤進", "営業部"));
		list.add(new Employee("山田幸太郎", "企画部"));


		// Employeeインスタンス一時参照用
		Employee tempEmp = null;

		// 特定の要へのアクセス
		System.out.print("１つ目の要素へのアクセス→");
		tempEmp = list.get(0);
		tempEmp.showEmployeeInfo();

		System.out.print("４つ目の要素へのアクセス→");
		tempEmp = list.get(3);
		tempEmp.showEmployeeInfo();

		System.out.println();

		System.out.println("すべての要素へ先頭から順にアクセス");
		for(Employee employee : list) {
			employee.showEmployeeInfo();
		}

		System.out.println();


		// 特定の要素を取り出して操作
		System.out.println("１つ目の要素の部署を変更する");
		tempEmp = list.get(0);
		tempEmp.setSection("システム開発部");
		System.out.print("１つ目の要素へのアクセス（部署変更後）→");
		tempEmp.showEmployeeInfo();
	}

}
