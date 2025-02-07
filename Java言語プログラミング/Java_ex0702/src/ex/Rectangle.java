package ex;

import java.util.Iterator;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class Rectangle implements Drawable{
	private int height;
	private int width;
	
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public void draw(char c) {
		for (int i = 0; i < height; i++) {
			System.out.println();
			for (int j = 0; j < width; j++) {
				System.out.print('+');
			}
		}
	}

}
