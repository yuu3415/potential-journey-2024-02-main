package sogo;
import java.util.Scanner;


 public class RockPaperScissors{

	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);

		janken(true,sc);
	}
	
	static void janken(boolean status,Scanner sc){
		int random = ((int)(Math.random() * 10))%3;

		String [] hand = new String[]{"グー","パー","チョキ"};


		String str = null;
		System.out.print(status?"「じゃんけん…」":"「あいこで…」");
		System.out.println("(0(グー)、1(パー)、2(チョキ)のいずれかを入力してください)：");

		str = sc.next();
		int myHand = Integer.parseInt(str);

		System.out.println(status?"「ぽん」":"しょっ！");

		if(hand[random % 3].equals(str)){
			// あいこ
			janken(false,sc);
		}else{

			// グーの場合
			if(hand[random].equals("グー")){
				if(hand[myHand].equals("チョキ")){
					System.out.println("あなたの負け");
					return;
				}else {
					System.out.println("あなたの勝ち");
					return;
				}
			//チョキの場合
			}else if(hand[random].equals("チョキ")){
				if(hand[myHand].equals("パー")){
					System.out.println("あなたの負け");
					return;
				}else {
					System.out.println("あなたの勝ち");
					return;
				}

			//パーの場合
			}else if (hand[random].equals("パー")){
				if(hand[myHand].equals("グー")){
					System.out.println("あなたの負け");
					return;
				}else {
					System.out.println("あなたの勝ち");
					return;
				}
			}


		}


	}


}