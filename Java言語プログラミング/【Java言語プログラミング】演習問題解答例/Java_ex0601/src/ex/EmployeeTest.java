/**
 * Java_ex0601
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
		Employee emp = new Employee();
		emp.setName("田中一郎");
		emp.setSection("総務部");
		emp.showEmployeeInfo();

		System.out.println();

		Manager mng = new Manager();
		mng.setName("林花子");
		mng.setSection("システム部");
		mng.setPost("部長");
		mng.showEmployeeInfo();
		mng.showPostInfo();
	}
}