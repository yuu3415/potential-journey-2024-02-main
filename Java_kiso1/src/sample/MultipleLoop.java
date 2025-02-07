package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class MultipleLoop {
	public static void main(String[] args) {
		int value =0;
		int Loop=0;
		
		while(Loop<=481){
			++value;
			Loop=19*value;
			System.out.print(Loop+" ");	
	}
		System.out.println("個数は、"+value+"個");
	}
}
