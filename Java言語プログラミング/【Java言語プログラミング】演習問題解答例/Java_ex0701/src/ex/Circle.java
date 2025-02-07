/**
 * Java_ex0701
 * ex.Circle.java
 */
package ex;

/**
 * 円を表すクラスです。
 * @author Yuki Kawamura
 */
public class Circle extends AbstractShape {
	/**
	 * 半径
	 */
	private int radius;

	/**
	 * 指定された半径を使用して、
	 * 新しいCircleオブジェクトを構築します。
	 * @param radius 半径
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * フィールドradiusの値を返します。
	 * @return 半径
	 */
	public int getRadius() {
		return radius;
	}

	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}
}
