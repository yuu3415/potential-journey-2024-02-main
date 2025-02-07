package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}
	
	double getArea() {
		double area;
		area=radius*radius*Math.PI;
		return area;
	}

}
