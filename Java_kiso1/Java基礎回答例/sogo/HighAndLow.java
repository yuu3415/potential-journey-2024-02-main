package sogo;

import java.util.Scanner;

class HighAndLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ans = (int) (Math.random() * 100); // 正解

		int inputNum = 0; // 入力された数字

		// 10回繰り返し
		for (int i = 0; i < 10; i++) {

			// 入力を促す文字表示
			System.out.print("数字を入力してください：");
			inputNum = Integer.parseInt(sc.next());

			// if文による分岐
			if (ans < inputNum) {
				System.out.println("HIGH");
			} else if (ans > inputNum) {
				System.out.println("LOW");
			} else {
				System.out.println("congratulation!!");
				break;
			}

			// 正解できなかった時
			if (i == 9) {
				System.out.println("GAME OVER");
			}
		}
	}
}