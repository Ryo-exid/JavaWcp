package progate;

import java.util.Scanner;

public class Dojo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Bicycle bicycle = new Bicycle("ビアンキ", "赤");
		System.out.println("【自転車の情報】");
		bicycle.printData();		
		System.out.println("-----------------");
		System.out.print("走る距離を入力してください：");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
	}
}
