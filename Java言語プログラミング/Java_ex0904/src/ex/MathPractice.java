package ex;

public class MathPractice {
	public static void main(String[] args) {
		System.out.println("1-100の範囲のランダム値を10個表示します。");
		
		for (int i = 1; i <= 10; i++) {
			int randomValue =(int)(Math.random()*100+1);
			System.out.println(i+"個目："+randomValue);
		}
	}
}	
