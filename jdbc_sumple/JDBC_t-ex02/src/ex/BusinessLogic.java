package ex;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/05
 */
public class BusinessLogic {
	public static void main(String[] args) throws SQLException {

		EmployeeDAO employeeDAO = new EmployeeDAO();
		Scanner scan = new Scanner(System.in);

		System.out.println("***** 従業員情報を操作します。*****");
		System.out.println("s:全従業員の情報を表示します。");
		System.out.println("i:従業員情報を登録します。");
		System.out.println("d:特定の従業員情報を削除します。");
		System.out.println("q:システムを終了します。");
		System.out.println();

		for (;;) {

			System.out.print("操作を選択してください。[s:すべて表示 i:登録 d:削除 q:終了]：");

			String str = scan.next();

			if (str.equals("s")) {
				try {
					List<Employee> employees = employeeDAO.selectAll();

					if (employees == null) {
						System.out.println("従業員情報を表示できませんでした。");
					} else {

						System.out.println("*** すべての従業員の表示 ***");

						for (int i = 0; i < employees.size(); i++) {
							String code = employees.get(i).getCode();
							String name = employees.get(i).getName();
							int age = employees.get(i).getAge();
							String section = employees.get(i).getSection();
							System.out.print(code + "\t| ");
							System.out.print(name + "  \t| ");
							System.out.print(age + "\t| ");
							System.out.print(section + "\n");
						}
					}
				} catch (SQLException e) {
					System.out.println("従業員を表示できませんでした。");
				}
			} else if (str.equals("i")) {
				try {
					System.out.println("登録する従業員情報を指定してください。");

					Employee employee = new Employee();

					System.out.print("・コード：");
					String str1 = scan.next();
					employee.setCode(str1);

					System.out.print("・氏名：");
					String str2 = scan.next();
					employee.setName(str2);

					System.out.print("・年齢：");
					String str3 = scan.next();
					int age = Integer.parseInt(str3);
					employee.setAge(age);

					System.out.print("・部署：");
					String str4 = scan.next();
					employee.setSection(str4);

					boolean duplication = false;

					for (int i = 0; i < employeeDAO.selectAll().size(); i++) {
						if (employee.getCode().equals(employeeDAO.selectAll().get(i).getCode())) {
							duplication = true;
						}
					}

					int num = employeeDAO.insert(employee);

					if (num == 0 || duplication) {
						System.out.println("従業員情報を登録できませんでした。");
					} else {
						System.out.println(num + "件の従業員情報を登録しました。");
					}
				} catch (SQLException e) {
					System.out.println("従業員を登録できませんでした。");
				}

			} else if (str.equals("d")) {
				try {
					System.out.println("削除する従業員のコードを指定してください。");

					System.out.print("・コード：");
					String del = scan.next();

					int num = employeeDAO.delete(del);

					if (num == 0) {
						System.out.println("従業員情報を削除できませんでした。");
					} else {
						System.out.println(num + "件の従業員情報を削除しました。");
					}
				} catch (SQLException e) {
					System.out.println("従業員を削除できませんでした。");
				}

			} else if (str.equals("q")) {
				System.out.println("システムを終了します。");

				break;

			} else {
				System.out.println("操作は次の中から選択してください。[s:すべて表示 i:登録 d:削除 q:終了]");
			}

		}

	}

}
