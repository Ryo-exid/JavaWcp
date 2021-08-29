package progate.V;

public class Car extends Vehicle {
	private int fuel = 50; // Carクラスの独自のフィールドを追加
	
	// コンストラクタ
	Car(String name, String color) {
		super(name, color); // スーパークラスのコンストラクタを呼び出す
	}
	
	public int getFuel() {
		return this.fuel;
	}
	
	public void printData() {
		super.printData(); // スーパークラスとの重複部分
		System.out.println("ガソリン量：" + this.getFuel() + "L");
	}
	
	// スーパークラス（Vehicle.java）でdistanceフィールドをprotectedにしているためアクセス可能
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		if (distance <= this.fuel) {
			this.distance += distance;
			this.fuel -= distance;
		} else {
			System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	// Carクラス独自のメソッド
	public void charge(int litre) {
	    System.out.println(litre + "L給油します");
	    if (litre <= 0) {
	      System.out.println("給油できません");
	    } else if (litre + this.fuel >= 100) {
	      System.out.println("満タンまで給油します");
	      this.fuel = 100;
	    } else {
	      this.fuel += litre;
	    }
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
}
