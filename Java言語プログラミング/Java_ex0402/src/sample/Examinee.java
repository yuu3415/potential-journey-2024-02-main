package sample;

public class Examinee {
		private String name;
		private int score;
		private String grade;
		
		public Examinee(String name,int score,String grade) {
			this.name=name;
			this.score=score;
			this.grade=grade;
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
			System.out.println("受験者名："+name);
			System.out.println("筆記試験："+score+"点");
			System.out.println("実技試験："+grade);
		}



	}
