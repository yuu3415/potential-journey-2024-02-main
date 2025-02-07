package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class TestResult3{
	public static void main(String[] args) {
	int a=101;
	
	
	if (a>100){
		System.out.println("値が不正です");
	}else if (a<0) {
		System.out.println("値が不正です");
		//上記の二つを&&を使用してくっつけたところ正常に条件分岐されなかった。０未満100より大きいという条件は矛盾しているので正常に動作しなかったと推測→論理積で行ってしまっていた。論理和なら可能
		
	}else if (a>=70) {
		System.out.println("合格です！");
	}else if (a<70) {
		System.out.println("不合格です。");
	}
}
}