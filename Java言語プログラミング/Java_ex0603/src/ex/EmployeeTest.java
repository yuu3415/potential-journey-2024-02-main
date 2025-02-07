package ex;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee la = new Employee("田中一郎","総務部");

		la.showEmployeeInfo();

		System.out.println();

		Manager ma=new Manager("林花子","システム部","部長");
		ma.showEmployeeInfo();
	}

}
