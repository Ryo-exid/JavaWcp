package extend.animal;

public abstract class Animal {
	protected String name;
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
	public abstract void cry();
}

// 抽象クラスとは、抽象メソッドを1つ以上持つクラスのこと