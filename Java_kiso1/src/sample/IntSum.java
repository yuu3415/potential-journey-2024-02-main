package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class IntSum {
	public static void main(String[] args) { 
		
		String result =sumLoop(1,10);
		System.out.println(result);
	}
	static String sumLoop(int min, int max) {
		int sum=0;
		int value=min;
		
		for (int i = min; i <= max; i++) {
			sum +=value;
			value=min+i;
		}
		String result=("最小値："+min+"\n"+"最大値："+max+"\n"+"加算結果："+sum);
		return result;
	}
}
