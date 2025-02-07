package sample;

import java.util.Iterator;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class FizzBuzz {
	public static void main(String[] args) {
	number(args[0]);
}
	static void number(String max) {
		int a=Integer.parseInt(max);
		
		for (int i = 1; i <= a; i++) {
			if ((i%3==0)&&(i%5==0)) {
				System.out.print("FizzBuzz ");
			}else if (i%3==0) {
				System.out.print("Fizz ");
			}else if (i%5==0) {
				System.out.print("Buzz ");
			}else {
				System.out.print(i+" ");
			}
		}
	}
}
