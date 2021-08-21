package extend.human;

public class Human {
	private String name; // privateは自分自身からのみアクセス可能
	protected int age; // protectedはサブクラスからもアクセス可能
	
	// コンストラクタ
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
