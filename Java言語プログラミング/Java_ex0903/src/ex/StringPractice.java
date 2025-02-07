package ex;

public class StringPractice {
	public static void main(String[] args) {
		String str = "Welcome to Java World!"; 
		
		if (str.contains(args[0])==true) {
			System.out.println("検索文字列『"+args[0]+"』が、文字列のインデックス番号"+str.indexOf(args[0])+"に見つかりました。");
		}else {
			System.out.println("検索文字列『"+args[0]+"』が、文字列に見つかりませんでした。");
		}
	}
}
