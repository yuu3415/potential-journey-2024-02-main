/**
 * Java_ex0602
 * ex.EmployeeTest.java
 */
package ex;

/**
 * Employeeのテストクラスです。
 * @author Yuki Kawamura
 */
public class EmployeeTest {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {
		Employee emp = new Employee("田中一郎","総務部");
		emp.showEmployeeInfo();

		System.out.println();

		Manager mng = new Manager("林花子","システム部","部長");
		mng.showEmployeeInfo();
		mng.showPostInfo();
	}
}