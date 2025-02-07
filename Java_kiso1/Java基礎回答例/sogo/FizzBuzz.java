package sogo;

public class FizzBuzz {
	 
public static void main(String[] args) {
		
		int max = Integer.parseInt(args[0]);
		fizzBuzz(max);

	}
	
	/**
     * １から上限値まで数値を順に表示する
	 * 
	 * 数値が３で割り切れる場合は「Fizz」、
	 * ５で割り切れる場合は「Buzz」、
	 * 両方で割り切れる場合は「FizzBuzz」と表示する。
	 * 
     * @param max 表示する数値の上限値
     */
	static void fizzBuzz(int max) {
		// 指定の数まで繰り返し表示
	    for (int i = 1; i <= max; i++) {

	    	// If文による判定
	    	if (i % 3 == 0 && i % 5 == 0) {
	    		System.out.print("FizzBuzz" + " ");
	    	} else if (i % 3 == 0) {
	    		System.out.print("Fizz" + " ");
	    	} else if (i % 5 == 0) {
	    		System.out.print("Buzz" + " ");
	    	} else {
	    		System.out.print(i + " ");
	    	}
	    }
	}
}
