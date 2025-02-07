/*
 * Java_ex0910
 * ex.ScanPractice.java
 */
package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Scannerを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class ScanPractice {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		// Listオブジェクトを生成
		List<Employee> list = new ArrayList<Employee>();

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("社員情報を登録します。（qで終了）");

			//社員名の入力受付
			System.out.print("社員名：");
			String name = scan.next();
			if(name.equals("q")) {
				break;
			}

			//部署名の入力受付
			System.out.print("部署名：");
			String section = scan.next();
			if(section.equals("q")) {
				break;
			}

			list.add(new Employee(name, section));

			System.out.println();
		}

		System.out.println();

		System.out.println("登録された全従業員の情報を表示します。");
		for(Employee employee : list) {
			employee.showEmployeeInfo();
		}
	}

}
