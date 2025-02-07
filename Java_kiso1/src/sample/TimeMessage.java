package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class TimeMessage {
	public static void main(String[] args) {
	
		int a =1;
	
	if ((6<=a)&&(a<=11)) {
		System.out.println(a+"時 おはよう");
	}else if ((12<=a)&&(a<=17)) {
		System.out.println(a+"時 こんにちは");
	}else if ((18<=a)&&(a<=23)) {
		System.out.println(a+"時 こんばんは");
	}else if (((1<=a)&&(a<=5)||(a==24))) {
		System.out.println(a+"時 おやすみ");	
		
	}
	}
}	
