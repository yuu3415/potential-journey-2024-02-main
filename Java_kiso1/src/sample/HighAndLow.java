package sample;

import java.util.Iterator;
import java.util.Scanner;

public class HighAndLow {
	public static void main(String[] args) {
		int num;
		int random=(int)(Math.random()*100);
		
		for (int i = 0; i < 10; i++) {
		Scanner sc = new Scanner(System.in);

		System.out.print("数字を入力してください：");
		num = sc.nextInt();
		
		String result=judge(num,random);
		
		System.out.println(result);
		
		if (result.equals("congratularion!")) {
			break;
		}
		
		}
	}

	private static String judge(int num, int random) {
		String result;
		
		if (random<num) {
			result="HIGH";
		}else if (random>num) {
			result="LOW";
		}else {
			result="congratularion!";
		}
		
		return result;
	}

}
