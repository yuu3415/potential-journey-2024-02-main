package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/22
 */
public class ExamTest {

	public static void main(String[] args) {
	Examination ex=new Examination();
	
	ex.judge(70);
	ex.judge("B");
	ex.judge(70, "B");
	}

}
