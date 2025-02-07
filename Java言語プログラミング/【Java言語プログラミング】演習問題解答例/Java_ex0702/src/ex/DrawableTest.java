/**
 * Java_ex0702
 * ex.DrawableTest.java
 */
package ex;

/**
 * Drawableのテストクラスです。
 * @author Yuki Kawamura
 */
public class DrawableTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {
		Drawable rectangle = new Rectangle(3, 5);
		rectangle.draw('+');

		System.out.println();

		Drawable horizontalLine =new HorizontalLine(20);
		horizontalLine.draw('*');
	}

}
