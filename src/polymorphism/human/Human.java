package polymorphism.human;

public class Human {
	private String name;
	protected int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// final修飾子（一度しか値を代入できない）オーバーライド禁止
	final public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getProfile() {
		return "名前は" + this.name + "、年齢は" + this.age + "です。";
	}
}
