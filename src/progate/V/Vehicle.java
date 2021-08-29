package progate.V;

abstract public class Vehicle { // 抽象メソッドを1つでも持つクラスは「抽象クラス」と呼ばれ、クラス名の前にabstractをつける
	// CarとBicycleの共通処理を記述
	private String name;
	private String color;
	protected int distance; // サブクラスからもアクセスできるようにする
	
	// コンストラクタ
	Vehicle(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return this.name = name;
	}
	
	public String getColor() {
		return this.color = color;
	}
	
	public int getDistance() {
		return this.distance = distance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}
	
	// 抽象メソッドrunを定義（乗り物は全て「走行する」という機能を持つが、乗り物ごとに走行方法が違う（処理内容を定めることができない）ため、処理内容を書かない抽象メソッドとして定義）
	// 抽象メソッドなので、サブクラスでオーバーライド（上書き）しなければならない  ※上書きしないとエラーになる
	abstract public void run(int distance);
}
