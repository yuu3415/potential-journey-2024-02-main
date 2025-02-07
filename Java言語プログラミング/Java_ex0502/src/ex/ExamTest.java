package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/22
 */
public class ExamTest {

	public static void main(String[] args) {
		Examination ex = new Examination();
		Examinee exam = new Examinee("市川京子", 72, "B");

		System.out.println("■■■受験者情報■■■");
		exam.showinfo();

		int score = exam.getScore();
		String grade = exam.getGrade();

		String writtenJudge = ex.judge(score);
		String skillsJudge = ex.judge(grade);
		String totallJudge = ex.judge(score, grade);

		System.out.println("筆記試験：" + writtenJudge);
		System.out.println("実技試験：" + skillsJudge);
		System.out.println("総合判定：" + totallJudge);
	}

}
