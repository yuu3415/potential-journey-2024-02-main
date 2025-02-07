package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class SearchNumber2 {
	public static void main(String[] args) {
		int[] array= {2,3,5,7,11,13,17,19};
		int value=30;
		
		boolean found=false;
		
		for (int i = 0; i < array.length; i++) {
			if (value==array[i]) {
				found=true;
				break;
			}
			}
		if (found) {
			//found=trueと条件分を指定したところ全てtrueということになってしまった。外したところ正常に動作。ここについては後程質問か日報に記載
			System.out.println(value+"が見つかりました。");
		}else {
			System.out.println(value+"は見つかりませんでした。");
		}
		}
	}
