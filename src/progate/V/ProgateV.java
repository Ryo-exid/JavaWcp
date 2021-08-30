package progate.V;

import java.util.Scanner;

public class ProgateV {
	public static void main(String[] args) {
		Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
	    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
	    
		Scanner scanner = new Scanner(System.in);
		Car car = new Car("フェラーリ", "赤");	
		
		// buyメソッドを用いて、person1にcarを購入させる
		person1.buy(car);
		
		// carの所有者をperson1に設定
		car.setOwner(person1);
		
		Bicycle bicycle = new Bicycle("ビアンキ", "緑");
		
		// buyメソッドを用いて、person2にbicycleを購入させる
		person2.buy(bicycle);
		
		// bicycleの所有者をperson2に設定
		bicycle.setOwner(person2);
		
		System.out.println("【車の情報】");
		car.printData();
		System.out.println("-----------------");
		System.out.print("走る距離を入力してください：");
		int carDistance = scanner.nextInt();
		car.run(carDistance);
			
		System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int litre = scanner.nextInt();
	    car.charge(litre);
	    
	    System.out.println("-----------------");
	    System.out.println("【車の所有者の情報】");
	    car.getOwner().printData();
		
		System.out.println("=================");
		System.out.println("【自転車の情報】");
		bicycle.printData();
		System.out.println("-----------------");
		System.out.print("走る距離を入力してください：");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
		
		System.out.println("-----------------");
	    System.out.println("【自転車の所有者の情報】");
	    bicycle.getOwner().printData();
	}
}
