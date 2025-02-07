package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class Employee {
	private String name;
	private String section;

	public void setName(String name) {
		this.name = name;
	}

	public void setSection(String section) {
		this.section = section;
	}

	void showEmployeeInfo() {
		System.out.println("名前：" + name);
		System.out.println("部署：" + section);
	}

}
