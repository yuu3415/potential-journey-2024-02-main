package ex;

import java.awt.geom.Area;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class Rectacgle {
	private int height;
	private int width;
	
	public Rectacgle(int height,int width) {
		this.height=height;
		this.width=width;
	}

	public int getHeight() {
		return height;
	}


	public int getWidth() {
		return width;
	}
	
	double getArea() {
		int area;
		area=height*width;
		return area;
	}


}
