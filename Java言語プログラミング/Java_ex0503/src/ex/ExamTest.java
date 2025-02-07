package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/22
 */
public class ExamTest {

	public static void main(String[] args) {

		Examinee exam = new Examinee("市川京子", 72, "B");

		System.out.println("■■■受験者情報■■■");
		exam.showinfo();

		int score = exam.getScore();
		String grade = exam.getGrade();

		

		exam.showjudge();

	}

}
