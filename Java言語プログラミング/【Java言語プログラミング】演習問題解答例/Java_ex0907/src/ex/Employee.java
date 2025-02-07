/*
 * Java_ex0907
 * ex.Employee.java
 */
package ex;

/**
 * 従業員を表します。
 * @author Yuki Kawamura
 */
public class Employee {

	/**
	 * 従業員の名前
	 */
	private String name;

	/**
	 * 部署
	 */
	private String section;

	/**
	 * 名前と部署を指定して
	 * 新しいEmployeeオブジェクトを構築します。
	 * @param name 名前
	 * @param section 部署
	 */
	public Employee(String name, String section) {
		this.name = name;
		this.section = section;
	}

	/**
	 * フィールドnameの値を返します。
	 * @return 従業員の名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * フィールドnameに値を設定します。
	 * @param name 従業員の名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールドsectionの値を返します。
	 * @return 部署
	 */
	public String getSection() {
		return section;
	}

	/**
	 * フィールドsectionに値を設定します。
	 * @param section 部署
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * 従業員情報（名前、部署）を表示します。
	 */
	void showEmployeeInfo() {
		System.out.print("名前：" + name);
		System.out.println("\t部署：" + section);
	}

}
