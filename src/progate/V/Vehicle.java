package progate.V;

// CarとBicycleの共通処理を記述
public class Vehicle {
	private String name;
	private String color;
	private int distance;
	
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
}