package ex;

public class ShapeTest {

	public static void main(String[] args) {
		Rectacgle re=new Rectacgle(3, 5);
		
		re.getHeight();
		re.getWidth();
		re.getArea();
		System.out.println("高さ"+re.getHeight()+"、幅"+re.getWidth()+"の四角形の面積："+re.getArea());
		
		Circle ci=new Circle(3);
		
		ci.getRadius();
		ci.getArea();
		System.out.println("半径"+ci.getRadius()+"の円の面積："+ci.getArea());
	}

}
