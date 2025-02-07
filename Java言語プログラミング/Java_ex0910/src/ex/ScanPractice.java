package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanPractice {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		for (;;) {

			Scanner scan = new Scanner(System.in);

			System.out.println("社員情報を入力します。(qで終了)");

			System.out.print("社員名：");

			String str = scan.next();

			if (str.equals("q")) {
				System.out.println();
				break;

			} else {
				System.out.print("部署名：");


				String str1 = scan.next();
				list.add(new Employee(str, str1));
				System.out.println();
				System.out.println();
			}
		}

		System.out.println("登録された全従業員の情報を表示します。");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("名前："+list.get(i).getName() + "	部署："+list.get(i).getSection());
		}
	}
}
