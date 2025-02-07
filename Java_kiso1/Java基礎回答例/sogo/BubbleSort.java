package sogo;

public class BubbleSort {
	public static void main(String[] args) {
		//要素数20の整数型配列を宣言
		int [] buf = new int [20];
		//並び変えるための配列を作る。ランダムに整数を作り配列に格納-100 ～100まで
		for(int i = 0; i < buf.length; i++) {
			int random = (int)(Math.random()*200)-100;
			buf[i]=random;


		}

		 // iはi回目の交換する回数
        for (int i = buf.length-1; i > 0; i-- ) {
            // j は交換する箇所の前からの番号を示している
            for (int j = 0; j < i; j++) {

                if(buf[j]<buf[j+1]){
                  //降順にしたい場合は不等号を逆に

                  int temp = buf[j];
                  buf[j] = buf[j+1];
                  buf[j+1] = temp;
                  //System.out.println(buf[j] + ":" +buf[j+1]);
                }

            }
        }
        //ソートした内容を出力
        for(int i = 0; i < buf.length; i++) {
			System.out.println(buf[i]);


		}
	}
}
