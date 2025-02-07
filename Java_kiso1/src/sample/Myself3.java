package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class Myself3 {
	public static void main(String[] args) {
		String result = introduce("佐竹優", 25);
		System.out.println(result);
	}

	static String introduce(String name, int age) {
		String result = ("私の名前は" + name + "、年齢は" + age + "歳です。");
		return result;
	}

}
