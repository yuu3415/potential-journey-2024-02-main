package sample;

import java.util.Scanner;

public class constellation {
	public static void main(String[] args) {
		int month;
		int day;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("誕生月を入力してください：");
		month=sc.nextInt();
		
		System.out.print("誕生日を入力してください：");
		day=sc.nextInt();
		
		String result=judge(month,day);
		
		System.out.println("あなたの星座は"+result+"です。");
	}

	private static String judge(int month, int day) {
		String result = null;
		
		switch(month) {
		case 1:
			if (day>=20) {
				result="水瓶座";
			}else {
				result="山羊座";
			}
			break;
			
		case 2:
			if (day>=19) {
				result="魚座";
			}else {
				result="水瓶座";
			}
			break;
			
		case 3:
			if (day>=21) {
				result="牡羊座";
			}else {
				result="魚座";
			}
			break;
			
		case 4:
			if (day>=20) {
				result="牡牛座";
			}else {
				result="牡羊座";
			}
			break;
			
		case 5:
			if (day>=21) {
				result="双子座";
			}else {
				result="牡牛座";
			}
			break;
			
		case 6:
			if (day>=22) {
				result="蟹座";
			}else {
				result="双子座";
			}
			break;
			
		case 7:
			if (day>=23) {
				result="獅子座";
			}else {
				result="蟹座";
			}
			break;
			
		case 8:
			if (day>=23) {
				result="乙女座";
			}else {
				result="獅子座";
			}
			break;
			
		case 9:
			if (day>=23) {
				result="天秤座";
			}else {
				result="乙女座";
			}
			break;
			
		case 10:
			if (day>=24) {
				result="蠍座";
			}else {
				result="天秤座";
			}
			break;
			
		case 11:
			if (day>=23) {
				result="射手座";
			}else {
				result="蠍座";
			}
			break;
			
		case 12:
			if (day>=22) {
				result="山羊座";
			}else {
				result="射手座";
			}
			break;
		}
		
		return result;
	}

}
