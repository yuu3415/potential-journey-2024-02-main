package sample;

import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/19
 */
public class Hello {
	public static void main(String[] args) {
		
		String str=null;
		
		java.util.Scanner so =new Scanner(System.in);
		
		System.out.println("名前を入力してください：");
		
		str=so.next();
		
		System.out.println(str+"さん、こんにちは。");
	}
}
