package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Season {
	public static void main(String[] args) {
		String season ="Spring";
		String japanese;
		
		switch(season) {
		case "Spring":
			japanese="春";
			break;
		case "Summer":
			japanese="夏";
			break;
		case "Fall":
			japanese="秋";
			break;
		case "Winter":
			japanese="冬";
			break;
		default:
			japanese="その他";
			break;
		}
		//defaultラベルを入れないとjapaneseの初期化ができていないとエラーが出てしまった。教材には省略することができると記載があったのだが原因は今のところ不明。
		
		
		System.out.println(japanese+":"+season);
	}

}
