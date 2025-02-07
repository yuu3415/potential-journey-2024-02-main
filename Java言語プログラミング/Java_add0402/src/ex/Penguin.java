package ex;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/08
 */
public class Penguin {
	private String name;
	private int age;
	private String type;
	
	public Penguin(String name,int age,String type) {
		this.name=name;
		this.age=age;
		this.type=type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	void showDisplay() {
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println("種類"+type);
		
	}
	
	
}
