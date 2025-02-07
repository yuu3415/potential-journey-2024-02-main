package ex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/27
 */
public class ListPractice {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("佐藤加奈子", "総務部"));
		list.add(new Employee("小林健司", "システム開発部"));
		list.add(new Employee("鈴木直美", "経理部"));
		list.add(new Employee("佐藤進", "営業部"));
		list.add(new Employee("山田幸太郎", "企画部"));

		System.out.println("１つ目の要素へのアクセス→名前：" + list.get(0).getName() + " 部署：" + list.get(0).getSection());
		System.out.println("4つ目の要素へのアクセス→名前：" + list.get(3).getName() + " 部署：" + list.get(3).getSection());

		System.out.println();

		System.out.println("すべての要素へ先頭から順にアクセス");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("名前：" + list.get(i).getName() + " 部署：" + list.get(i).getSection());
		}

		System.out.println();
		System.out.println("１つ目の要素の部署を変更する");
		list.remove(0);
		list.add(0, new Employee("佐藤加奈子", "システム開発部"));

		System.out.println("１つ目の要素へのアクセス（部署変更後）→名前：" + list.get(0).getName() + " 部署：" + list.get(0).getSection());

	}
}
