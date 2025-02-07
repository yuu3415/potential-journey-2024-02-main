/**
 * Java_ex0702
 * ex.Rectangle.java
 */
package ex;

/**
 * 長方形を表すクラスです。
 * @author Yuki Kawamura
 */
public class Rectangle implements Drawable {

	/**
	 * 高さ
	 */
	private int height;

	/**
	 * 幅
	 */
	private int width;

	/**
	 * 指定された高さと幅を使用して、
	 * 新しいRectangleオブジェクトを構築します。
	 * @param height
	 * @param width
	 */
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(char c) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
