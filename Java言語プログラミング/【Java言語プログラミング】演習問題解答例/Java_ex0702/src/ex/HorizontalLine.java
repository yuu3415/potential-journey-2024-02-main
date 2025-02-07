/**
 * Java_ex0702
 * ex.HorizontalLine.java
 */
package ex;

/**
 * 水平線を表すクラスです。
 * @author Yuki Kawamura
 */
public class HorizontalLine implements Drawable {

	/**
	 * 長さ
	 */
	private int length;

	/**
	 * 指定された長さを使用して、
	 * 新しいHorizontalLineオブジェクトを構築します。
	 * @param length
	 */
	public HorizontalLine(int length) {
		super();
		this.length = length;
	}

	@Override
	public void draw(char c) {
		for (int i = 1; i <= length; i++) {
			System.out.print(c);
		}
	}
}
