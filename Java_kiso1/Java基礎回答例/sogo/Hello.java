package sogo;

import java.util.Scanner;

class Hello {
 
	public static void main(String[] args) {
		String name;//名前
		
		//名前の入力を促すメッセージを表示する
		System.out.print("名前を入力してください：");
		
		//キーボード入力を受け付ける
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		//入力された値を使ってメッセージを表示する
		System.out.println(name + "さん、こんにちは。"); 
	}
}
