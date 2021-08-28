package progate;

public class Car {
	private String name;
	private String color;
	private int distance = 0; // 走行距離、初期値0（km）
	private int fuel = 100; // ガソリン量、初期値100（L）
	
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
}
