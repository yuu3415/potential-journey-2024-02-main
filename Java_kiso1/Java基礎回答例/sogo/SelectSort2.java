package sogo;

public class SelectSort2 {
	public static void main(String[] args) {
		int[] array ={6,2,36,5,3,-6,4364,0,67,8};

		for(int i = 0 ; i <= 9 ; i++){
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
		int k = 0;
		int j = 0;
		
		while ( j <= 9 ){
			int min = array[j] ;
			for(int i = j ; i <= 9 ; i++ ){
				if(array[i] < min ){
					min = array[i];
					k = i;
				}
			}
			array[k] = array[j];
			array[j] = min;
			j = j +1;
		}
		for(int i = 0 ; i <= 9 ; i++){
		System.out.print(array[i]+" ");
		}
	}
}
