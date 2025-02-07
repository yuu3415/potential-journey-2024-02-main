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
}
