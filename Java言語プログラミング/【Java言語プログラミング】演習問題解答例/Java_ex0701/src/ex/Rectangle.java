/**
 * Java_ex0701
 * ex.Rectangle.java
 */
package ex;

/**
 * 長方形を表すクラスです。
 * @author Yuki Kawamura
 */
public class Rectangle extends AbstractShape {
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

	/**
	 * フィールドheightの値を返します。
	 * @return 高さ
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * フィールドwidthの値を返します。
	 * @return 幅
	 */
	public int getWidth() {
		return width;
	}

	@Override
	double getArea() {
		return height * width;
	}
}
