package sample;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ramdom = new int[25];

		for (int i = 0; i < ramdom.length; i++) {
			if (i == 12) {
				ramdom[i] = 0;
			}

			else if (i % 5 == 0) {
				int random1 = (int) (Math.random() * 15 + 1);
				ramdom[i] = random1;
			} else if (i % 5 == 1) {
				int random1 = (int) (Math.random() * 15 + 16);
				ramdom[i] = random1;
			} else if (i % 5 == 3) {
				int random1 = (int) (Math.random() * 15 + 31);
				ramdom[i] = random1;
			} else if (i % 5 == 4) {
				int random1 = (int) (Math.random() * 15 + 46);
				ramdom[i] = random1;
			} else {
				int random1 = (int) (Math.random() * 15 + 61);
				ramdom[i] = random1;
			}
		}
		print(ramdom);

		for (;;) {
			int bingo = (int) (Math.random() * 76);
			

			reach(ramdom);
			int reach = reach(ramdom);

			sc.nextLine();

			print(ramdom, bingo, reach );

			String result = judge(ramdom, bingo);

			if (result.equals("congratulation!")) {
				System.out.println(result);
				break;

			}
		}
	}

	static int reach(int[] ramdom) {
		int reachCnt = 0;

		for (int i = 0; i < 5; i++) {
			int yokoCounter = 0;
			int tateCounter = 0;
			for (int j = 0; j < 5; j++) {
				if (ramdom[j + (i * 5)] == 0) {
					yokoCounter++;
				}
				if (ramdom[i + (j * 5)] == 0) {
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

		for (int i = 0; i < 5; i++) {

			if (ramdom[5 * i + i] == 0)
				slashCounter++;

			if (ramdom[(i + 1) * 5 - (i + 1)] == 0)
				backSlashCounter++;

		}

		if (slashCounter == 4)
			reachCnt++;
		if (backSlashCounter == 4)
			reachCnt++;

		return reachCnt;

	}

	private static void print(int[] ramdom, int bingo, int reach ) {
		System.out.println("出た数字：" + bingo);

		if (hit(bingo, ramdom) == true) {
			System.out.println("Hit");
		} else if(hit(bingo, ramdom)==false) {
			System.out.println("Deviate");
		}

		System.out.println("----------------");
		System.out.print("|Ｂ|Ｉ|Ｎ|Ｇ|Ｏ|");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("----------------");
			for (int j = 0; j < 5; j++) {
				if (ramdom[j + (5 * i)] == 0) {
					System.out.print("|■");
				} else if (ramdom[j + (5 * i)] < 10) {
					System.out.print("| " + ramdom[j + (5 * i)]);
				} else {
					System.out.print("|" + ramdom[j + (5 * i)]);
				}

			}

		}
		System.out.println();
		System.out.println("----------------");
		System.out.println("リーチ数：" + reach);

	}

	static boolean hit(int bingo, int[] ramdom) {
		boolean hit = false;
		for (int i = 0; i < 25; i++) {
			if (bingo == ramdom[i]) {
				hit = true;
				ramdom[i] = 0;
			}
		}
		return hit;

	}

	static String judge(int[] ramdom, int bingo) {
		String result = "no";
		for (int i = 0; i < 5; i++) {
			if (ramdom[i] + ramdom[i + 5] + ramdom[i + 10] + ramdom[i + 15] + ramdom[i + 20] == 0) {
				result = "congratulation!";
				break;
			} else if (ramdom[0] + ramdom[6] + ramdom[12] + ramdom[18] + ramdom[24] == 0) {
				result = "congratulation!";
				break;
			} else if (ramdom[4] + ramdom[8] + ramdom[12] + ramdom[16] + ramdom[20] == 0) {
				result = "congratulation!";
				break;
			} else if (ramdom[(5 * i)] + ramdom[(5 * i) + 1] + ramdom[(5 * i) + 2] + ramdom[(5 * i) + 3]
					+ ramdom[(5 * i) + 4] == 0) {
				result = "congratulation!";
			}
		}

		return result;
	}

	static void print(int[] ramdom) {
		System.out.println("----------------");
		System.out.print("|Ｂ|Ｉ|Ｎ|Ｇ|Ｏ|");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("----------------");
			for (int j = 0; j < 5; j++) {
				if (ramdom[j + (5 * i)] == 0) {
					System.out.print("|■");
				} else if (ramdom[j + (5 * i)] < 10) {
					System.out.print("| " + ramdom[j + (5 * i)]);
				} else {
					System.out.print("|" + ramdom[j + (5 * i)]);
				}

			}

		}
		System.out.println();
		System.out.println("----------------");
		System.out.println("リーチ数：0");
	}

}
