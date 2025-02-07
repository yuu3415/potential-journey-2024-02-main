/**
 * Java_ex0601
 * ex.Manager.java
 */
package ex;

/**
 * 管理職を表します。
 * @author Yuki Kawamura
 */
public class Manager extends Employee {
	/**
	 * 役職
	 */
	private String post;

	/**
	 * フィールドpostの値を返します。
	 * @return 役職
	 */
	public String getPost() {
		return post;
	}

	/**
	 * フィールドpostの値を設定します。
	 * @param post 役職
	 */
	public void setPost(String post) {
		this.post = post;
	}

	/**
	 * 役職情報を表示します。
	 */
	void showPostInfo() {
		System.out.println("役職：" + post);
	}
}