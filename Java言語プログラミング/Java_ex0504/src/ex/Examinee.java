package ex;

public class Examinee {
	private String name;
	private int score;
	private String grade;

	public Examinee(String name, int score, String grade) {
		this.name = name;
		this.score = score;
		this.grade = grade;
	}

	public Examinee(String name, int score) {
		this(name, score, null);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	void showinfo() {
		System.out.println("■■■受験者情報■■■");
		System.out.println("受験者名：" + name);
		System.out.println("筆記試験：" + score + "点");
		if (grade == null) {
			System.out.println("実技試験：評価なし");
		} else {
			System.out.println("実技試験：" + grade);
		}
	}

	void showjudge() {
		Examination ex = new Examination();

		String writtenJudge = ex.judge(score);
		String skillsJudge = ex.judge(grade);
		String totallJudge = ex.judge(score, grade);

		System.out.println("■■■ 合 否 ■■■");
		System.out.println("筆記試験：" + writtenJudge);
		System.out.println("実技試験：" + skillsJudge);
		System.out.println("総合判定：" + totallJudge);
	}
}
