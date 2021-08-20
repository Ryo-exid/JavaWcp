package practice;

public class CapsuleMan {
	private String name;
	private int age;
	
	// コンストラクタ
	public CapsuleMan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) { // フィールド型の引数を忘れない
		this.age = age;
	}
}
