/*
 * Java_m-ex02
 * ex.ExamTest.java
 */
package ex;

/**
 * Examineeのテストクラスです。
 * @author Yuki Kawamura
 */
public class ExamTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		Examinee[] examineeAry = {
				new Examinee("山田太郎", 70, "A"),
				new Examinee("浜田南", 83, "B"),
				new Examinee("上田翔平", 48, "A"),
				new Examinee("林花子", 55, "A"),
				new Examinee("田中一郎", 62, "B"),
				new Examinee("市川京子", 72, "B"),
				new Examinee("畑山楓", 51, "A"),
				new Examinee("高田昇", 28)
		};

		int sum = 0;

		for (int i = 0; i < examineeAry.length; i++) {
			sum += examineeAry[i].getScore();
		}

		double average = (double)sum / examineeAry.length;

		System.out.println("■■■統計情報■■■");
		System.out.println("受験者数：" + examineeAry.length + "名");
		System.out.println("筆記試験の平均点" + average + "点");
	}
}