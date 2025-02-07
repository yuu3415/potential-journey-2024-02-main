package sample;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		int num;
		int vs = (int) (Math.random() * 3);

		System.out.println("「じゃんけん…」");
		System.out.print("（0（グー）、1（パー）、2（チョキ）のいずれかを入力してください）：");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		System.out.println("「ぽんっ！」");

		String result = judge(num, vs);

		System.out.println(result);

		if (num == vs) {
			for (;;) {
				int vs1 = (int) (Math.random() * 3);

				System.out.println("「あいこで…」");
				System.out.println("（0（グー）、1（パー）、2（チョキ）のいずれかを入力してください）：");

				Scanner sc1 = new Scanner(System.in);
				num = sc1.nextInt();

				System.out.println("「しょっ！」");

				String result1 = judge1(num, vs1);

				System.out.println(result1);

				if (!(num == vs1)) {
					break;
				}
			}

		}

	}

	private static String judge(int num, int vs) {
		String result = null;

		if (num == 0) {
			if (vs == 0) {
				result = "（あなた：グー）\n （相手：グー）";
			} else if (vs == 1) {
				result = "（あなた：グー）\n （相手：パー） /n あなたの負け";
			} else if (vs == 2) {
				result = "（あなた：グー）\n （相手：チョキ） /n あなたの勝ち";
			}

		} else if (num == 1) {
			if (vs == 0) {
				result = "（あなた：パー）\n （相手：グー） \n あなたの勝ち";
			} else if (vs == 1) {
				result = "（あなた：パー）\n （相手：パー)";
			} else if (vs == 2) {
				result = "（あなた：パー）\n （相手：チョキ） \n あなたの負け";
			}

		} else if (num == 2) {
			if (vs == 0) {
				result = "（あなた：チョキ）\n （相手：グー） \n あなたの負け";
			} else if (vs == 1) {
				result = "（あなた：チョキ）\n （相手：パー) \n あなたの勝ち";
			} else if (vs == 2) {
				result = "（あなた：チョキ）\n （相手：チョキ）";
			}
		}
		return result;
	}

	private static String judge1(int num, int vs) {
		String result1 = null;

		if (num == 0) {
			if (vs == 0) {
				result1 = "（あなた：グー）\n （相手：グー）";
			} else if (vs == 1) {
				result1 = "（あなた：グー）\n （相手：パー） /n あなたの負け";
			} else if (vs == 2) {
				result1 = "（あなた：グー）\n （相手：チョキ） /n あなたの勝ち";
			}

		} else if (num == 1) {
			if (vs == 0) {
				result1 = "（あなた：パー）\n （相手：グー） \n あなたの勝ち";
			} else if (vs == 1) {
				result1 = "（あなた：パー）\n （相手：パー)";
			} else if (vs == 2) {
				result1 = "（あなた：パー）\n （相手：チョキ） \n あなたの負け";
			}

		} else if (num == 2) {
			if (vs == 0) {
				result1 = "（あなた：チョキ）\n （相手：グー） \n あなたの負け";
			} else if (vs == 1) {
				result1 = "（あなた：チョキ）\n （相手：パー) \n あなたの勝ち";
			} else if (vs == 2) {
				result1 = "（あなた：チョキ）\n （相手：チョキ）";
			}
		}

		return result1;
	}

}
