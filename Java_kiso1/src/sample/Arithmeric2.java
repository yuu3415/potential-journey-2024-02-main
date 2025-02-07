package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class Arithmeric2 {
	public static void main(String[] args) {
		int first=1;
		int width=4;
		int number=5;
		
		int[] array = getProgression(first,width,number);
		
		System.out.println("初項＝"+first+",公差＝"+width+",項数＝"+number);
		
		System.out.print("等差数列：");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	static int[] getProgression(int first, int width,int number) {
		int sum=first;
		int[] array=new int [number];
		array[0]=first;
		
		for (int i =1 ; i < number; i++) {
			sum +=width;
			array[i]=sum;
		}
		
		return array;
	}
}
