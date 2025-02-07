package sogo;

import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		int month; // 誕生月
		int day; // 誕生日

		Scanner sc = new Scanner(System.in);

		System.out.print("誕生月を入力してください：");
		month = Integer.parseInt(sc.next());

		System.out.print("誕生日を入力してください：");
		day = Integer.parseInt(sc.next());

		String seiza = ""; // 星座

		if ((month == 3 && 21 <= day && day <= 31) || (month == 4 && 1 <= day && day <= 19)) {
			seiza = "牡羊座";
		} else if ((month == 4 && 20 <= day && day <= 30) || (month == 5 && 1 <= day && day <= 20)) {
			seiza = "牡牛座";
		} else if ((month == 5 && 21 <= day && day <= 31) || (month == 6 && 1 <= day && day <= 21)) {
			seiza = "双子座";
		} else if ((month == 6 && 22 <= day && day <= 30) || (month == 7 && 1 <= day && day <= 22)) {
			seiza = "蟹座";
		} else if ((month == 7 && 23 <= day && day <= 31) || (month == 8 && 1 <= day && day <= 22)) {
			seiza = "獅子座";
		} else if ((month == 8 && 23 <= day && day <= 31) || (month == 9 && 1 <= day && day <= 22)) {
			seiza = "乙女座";
		} else if ((month == 9 && 23 <= day && day <= 30) || (month == 10 && 1 <= day && day <= 23)) {
			seiza = "天秤座";
		} else if ((month == 10 && 24 <= day && day <= 31) || (month == 11 && 1 <= day && day <= 22)) {
			seiza = "蠍座";
		} else if ((month == 11 && 23 <= day && day <= 30) || (month == 12 && 1 <= day && day <= 21)) {
			seiza = "射手座";
		} else if ((month == 12 && 22 <= day && day <= 31) || (month == 1 && 1 <= day && day <= 19)) {
			seiza = "山羊座";
		} else if ((month == 1 && 20 <= day && day <= 31) || (month == 2 && 1 <= day && day <= 18)) {
			seiza = "水瓶座";
		} else if ((month == 2 && 19 <= day && day <= 29) || (month == 3 && 1 <= day && day <= 20)) {
			seiza = "魚座";
		} else {
			seiza = "該当なし";
		}

		// 表示
		System.out.println("あなたの星座は" + seiza + "です。");
	}
}
