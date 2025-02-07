package ex;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager la = new Manager();
		la.setName("田中一郎");
		la.setSection("総務部");

		la.showEmployeeInfo();

		System.out.println();

		la.setName("林花子");
		la.setSection("システム部");
		la.setPost("部長");

		la.showEmployeeInfo();
		la.showPostInfo();
	}

}
