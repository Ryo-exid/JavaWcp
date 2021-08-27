package progate;

import java.util.Scanner;

public class Dojo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("何人分の情報を入力しますか：");
		int persons = scanner.nextInt();
		
		for (int i = 1; i <= persons; i++) {
			System.out.println(i + "人目");
			System.out.print("名前：");
			String firstName = scanner.next();
			
			System.out.print("名字：");
			String lastName = scanner.next();
			
			System.out.print("年齢：");
			int age = scanner.nextInt();
			
			System.out.print("身長(m)：");
			double height = scanner.nextDouble();
			
			System.out.print("体重(kg)：");
			double weight = scanner.nextDouble();
			
			Person.printData(firstName, lastName, age, height, weight);
		}
	}
}
