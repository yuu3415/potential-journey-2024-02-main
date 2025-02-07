package ch04;

class Season {
	 
	public static void main(String[] args) {
		String seasonInJapanese;		// 日本語の季節
		String seasonInEnglish = "";	// 英語の季節

		seasonInJapanese = "夏";

		// switch文による判定
		switch (seasonInJapanese) {
		case "春":
			seasonInEnglish = "Spring";
			break;

		case "夏":
			seasonInEnglish = "Summer";
			break;

		case "秋":
			seasonInEnglish = "Fall";
			break;

		case "冬":
			seasonInEnglish = "Winter";
			break;
			
		default:
			/*何もしない */
			break;
		}

		// 結果を表示
		System.out.println(seasonInJapanese + "：" + seasonInEnglish);
	}
}
