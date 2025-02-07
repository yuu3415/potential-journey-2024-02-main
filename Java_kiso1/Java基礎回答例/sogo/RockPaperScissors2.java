package sogo;

import java.util.Scanner;

public class RockPaperScissors2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		janken(true, sc);
	}

	// status false aiko true 1time
	static void janken(boolean status, Scanner sc) {

		int[][] shohaiTable = { { 0, 1, -1 }, { -1, 0, 1 }, { 1, -1, 0 } };//勝ち負けの2次元配列

		System.out.print(status ? "「じゃんけん…」" : "「あいこで…」");
		System.out.println("(0(グー)、1(パー)、2(チョキ)のいずれかを入力してください)：");

		int myHand = sc.nextInt();

		System.out.println(status ? "「ぽん」" : "しょっ！");
		
		int random = ((int) (Math.random() * 10)) % 3;

		if (shohaiTable[myHand][random%3]==0) {
			// あいこ
			janken(false, sc);
		// 勝ちのとき 
		} else if(shohaiTable[myHand][random%3]==1){
			System.out.println("あなたの勝ち");

		}else {
			System.out.println("あなたの負け");
		}

	}

}