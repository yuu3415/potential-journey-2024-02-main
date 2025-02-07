package sogo;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
	static boolean[] alReadyExists = new boolean[70];
	static int[][] bingo = new int[5][5];

	public static void main(String[] args) {

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[j][i] = r.nextInt(15) + 1 + (15 * i);
			}

		}

		bingo[2][2] = 0;
		print(bingo, 0, false);

		Scanner sc = new Scanner(System.in);
		while (true) {

			sc.nextLine();
			int hit = randomCreate();

			search(bingo, hit);

			int result = reachCounter();

			boolean check = bingoCheck();

			print(bingo, result, check);

			if (check)
				break;

		}

	}

	static int randomCreate() {
		int random = -1;

		while (true) {
			random = ((int) (Math.random() * 70)) + 1;

			if (!alReadyExists[random - 1]) {
				alReadyExists[random - 1] = true;
				break;
			}
		}

		return random;
	}

	// bingo or not
	static boolean bingoCheck() {

		for (int i = 0; i < 5; i++) {
			if (bingo[i][0] + bingo[i][1] + bingo[i][2] + bingo[i][3] + bingo[i][4] == 0) {
				return true;
			}
			if (bingo[0][i] + bingo[1][i] + bingo[2][i] + bingo[3][i] + bingo[4][i] == 0) {
				return true;
			}

		}
		if (bingo[0][0] + bingo[1][1] + bingo[2][2] + bingo[3][3] + bingo[4][4] == 0) {
			return true;
		}
		if (bingo[4][0] + bingo[3][1] + bingo[2][2] + bingo[1][3] + bingo[0][4] == 0) {
			return true;
		}

		return false;
	}

	static int reachCounter() {

		int reachCnt = 0;

		for (int i = 0; i < 5; i++) {

			int yokoCounter = 0;
			int tateCounter = 0;
			//横チェック// 縦チェック
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] == 0) {
					//zeroCnt +=1;
					yokoCounter++;
				}
				if (bingo[j][i] == 0) {
					tateCounter++;
				}
			}
			if (yokoCounter == 4)
				reachCnt++;
			if (tateCounter == 4)
				reachCnt++;

		}

		int slashCounter = 0;
		int backSlashCounter = 0;
		// 斜めチェック
		for (int i = 0; i < 5; i++) {

			if (bingo[i][i] == 0)
				slashCounter++;

			if (bingo[4 - i][i] == 0)
				backSlashCounter++;

		}

		if (slashCounter == 4)
			reachCnt++;
		if (backSlashCounter == 4)
			reachCnt++;

		return reachCnt;
	}

	static void search(int[][] bingo, int hit) {

		boolean check = false;

		System.out.println("出た数字：" + hit);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (bingo[i][j] == hit) {
					bingo[i][j] = 0;
					check = true;
				}
			}

		}
		if (check)
			System.out.println("Hit");
		else
			System.out.println("Deviate");
	}

	static void print(int[][] bingo, int reachCnt, boolean bingoChecker) {
		System.out.println(" |Ｂ|Ｉ|Ｎ|Ｇ|Ｏ|");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (bingo[i][j] == 0) {
					System.out.print("■" + "  ");

				} else {
					System.out.print(bingo[i][j] / 10 == 0 ? " " + bingo[i][j] + "  " : bingo[i][j] + "  ");

				}
			}
			System.out.println();

		}

		if (!bingoChecker) {
			System.out.println("リーチ数：" + reachCnt);
		} else {
			System.out.println("Congratulation!!");
		}

	}
}
