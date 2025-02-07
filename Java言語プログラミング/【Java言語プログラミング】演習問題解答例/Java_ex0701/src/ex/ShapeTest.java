/**
 * Java_ex0701
 * ex.ShapeTest.java
 */
package ex;

/**
 * AbstractShapeのサブクラスのテストクラスです。
 * @author Yuki Kawamura
 */
public class ShapeTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(3, 5);
		System.out.println("高さ" + rectangle.getHeight()
				+ "、幅" + rectangle.getWidth()
				+ "の四角形の面積：" + rectangle.getArea());

		Circle circle = new Circle(3);
		System.out.println("半径" + circle.getRadius() + "の円の面積：" + circle.getArea());
	}
}
