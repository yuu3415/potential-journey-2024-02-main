/**
 * Java_ex0602
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
	 * 名前、部署、役職を使用して
	 * 新しいManagerオブジェクトを構築します。
	 * @param name 名前
	 * @param section 部署
	 * @param post 役職
	 */
	public Manager(String name, String section, String post) {
		super(name, section);
		this.post = post;
	}

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