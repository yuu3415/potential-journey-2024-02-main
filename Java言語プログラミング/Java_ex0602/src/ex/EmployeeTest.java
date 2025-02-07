package ex;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager la = new Manager("田中一郎","総務部","");

		la.showEmployeeInfo();

		System.out.println();

		la=new Manager("林花子","システム部","部長");
		la.showEmployeeInfo();
		la.showPostInfo();
	}

}
