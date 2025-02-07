package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class HorizontalLine implements Drawable {
	private int length;
	
	public HorizontalLine(int length) {
		this.length=length;
	}
	
	
	public void draw(char c) {
		for (int i = 0; i < length; i++) {
			System.out.print('*');
		}
	}

}
