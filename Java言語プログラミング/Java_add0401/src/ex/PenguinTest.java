package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/08
 */
public class PenguinTest {
	public static void main(String[] args) {
		Penguin penguin=new Penguin();
		
		penguin.setName("ペン子");
		
		penguin.setAge(3);
		
		penguin.setType("フェアリーペンギン");
		
		System.out.println("名前は"+penguin.getName()+"、");
		System.out.println(penguin.getAge()+"歳の"+penguin.getType()+"です。");
	}
	
	
}
