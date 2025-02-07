package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class OddEven {
	public static void main(String[] args) {
		
		int a =-100;
	
	if ((0<=a)&&(a%2)==1) {
		System.out.println(a+"は奇数です");
	}else if ((0<=a)&&(a%2)==0) {
		System.out.println(a+"は偶数です");
	}else if (a<=0) {
		System.out.println("0より大きい値を設定してください。");
	}
	}
}	
