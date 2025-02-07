package ex;

public class DrawableTest {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(3, 5);
		
		rectangle.draw('+');
		
		System.out.println();
		System.out.println();
		
		
		HorizontalLine horizontalLine=new HorizontalLine(20);
		
		horizontalLine.draw('*');
	}
}
