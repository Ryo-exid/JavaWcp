package progate;

public class Car {
	private String name;
	private String color;
	private int distance = 0; // 走行距離、初期値0（km）
	private int fuel = 100; // ガソリン量、初期値100（L）
	private int litre; // 給油量
	
	Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		if (distance <= this.fuel) { // 走行距離がガソリン量以下の場合
			this.distance += distance; // 走行距離更新
			this.fuel -= distance; // ガソリン量更新（1kmごとに1L減るという仮定）
		} else {
			System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void charge(int litre) {
		System.out.println(litre + "L給油します");
		if (litre <= 0) { // 給油量が0以下の場合
			System.out.println("給油できません");
		} else if (litre + this.fuel >= 100) { // 給油量とガソリン量の合計が100以上の場合
			System.out.println("満タンまで給油します");
			this.fuel = 100; // ガソリン量を満タン（初期値の100）に戻す
		} else { // 給油量が0Lより多く、満タン未満の場合
			this.fuel += litre; // ガソリン量の値を更新（給油した分増やす）
		}
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
}
