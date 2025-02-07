package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/22
 */
public class ExamTest {
	public static void main(String[] args) {
		
		Examinee exminee1 = new Examinee();
		exminee1.setName("林花子");
		exminee1.setScore(55);
		exminee1.setGrade("A");
		
		System.out.println("名前は"+exminee1.getName()+"、");
		System.out.println("筆記は"+exminee1.getScore()+"点"+"、");
		System.out.println("実技は"+exminee1.getGrade()+"判定でした");
	}
}
