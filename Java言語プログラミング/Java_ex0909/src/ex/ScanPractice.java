package ex;

import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class ScanPractice {
	public static void main(String[] args) {

		for (;;) {

			Scanner scan=new Scanner(System.in);

			System.out.println("文字列を入力してください：");

			String str=scan.next();

			if (str.equals("quit")) {
				System.out.println("プログラムを終了します");
				break;

			} else {
				System.out.println("入力された値は、『" + str + "』です。");
			}
		}
	}
}
