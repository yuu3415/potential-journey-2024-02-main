package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/26
 */
public class Manager extends Employee {

	private String post;

	public void setPost(String post) {
		this.post = post;
	}

	void showPostInfo() {
		System.out.println("役職：" + post);
	}

}
