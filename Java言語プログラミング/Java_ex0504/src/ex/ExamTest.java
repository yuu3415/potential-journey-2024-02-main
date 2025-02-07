package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/22
 */
public class ExamTest {

	public static void main(String[] args) {

		Examinee exam = new Examinee("市川京子", 72, "B");
		Examinee exam1 = new Examinee("高田昇", 28);

		exam.showinfo();
		exam.showjudge();

		System.out.println();

		exam1.showinfo();
		exam1.showjudge();

	}

}
