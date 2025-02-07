package ex;

public class StringPractice {
	public static void main(String[] args) {
		System.out.println("1つめの文字列："+args[0]);
		System.out.println("2つめの文字列："+args[1]);
		
		if (args[0].equals(args[1])) {
			System.out.println("二つの文字列は等しい");
		}
		else {
			System.out.println("二つの文字は等しくない");
		}
	}
}
