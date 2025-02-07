package sample;

import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class ConsoleInLoop {
	public static void main(String[] args) {

		for (;;) {

			String str = null;

			Scanner sc = new Scanner(System.in);

			System.out.println("文字列を入力してください：");

			str = sc.nextLine();

			if (str.equals("quit")) {
				System.out.println("プグラムを終了します");
				break;

			} else {
				System.out.println("入力された値は、『" + str + "』です。");
			}
		}
	}
}
