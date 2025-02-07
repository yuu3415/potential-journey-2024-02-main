/*
 * Java_ex0909
 * ex.ScanPractice.java
 */
package ex;

import java.util.Scanner;

/**
 * Scannerを扱う練習のためのクラスです。
 * @author Yuki Kawamura
 */
public class ScanPractice {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {
        String str = null;
       	Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.print("文字列を入力してください：");
	       	str = sc.nextLine();

        	if (!str.equals("quit")) {
        		System.out.println("入力された値は、『" + str + "』です。");
        	} else {
        		System.out.println("プログラムを終了します");
        		break;
        	}
        }
	}
}
