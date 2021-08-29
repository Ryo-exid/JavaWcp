package progate.V;

public class Bicycle extends Vehicle {
	Bicycle(String name, String color) {
		super(name, color); // スーパークラスのコンストラクタを呼び出す
	}
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		this.distance += distance;
		System.out.println("走行距離：" + this.distance + "km");
	}
}
