package progate;

public class Bicycle {
	// フィールド
	private String name;
	private String color;
	private int distance = 0;
	
	// コンストラクタ
	Bicycle(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	// メソッド
	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}
	
	
}
