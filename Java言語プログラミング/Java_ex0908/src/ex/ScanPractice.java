package ex;

import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/19
 */
public class ScanPractice {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("名前を入力してください：");
		
		String str=scan.next();
		
		System.out.println(str+"さん、こんにちは。");
	}
}
