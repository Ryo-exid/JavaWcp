package progate;

public class Person {
	public static void printData(String firstName, String lastName, int age, double height, double weight) {
		System.out.println("名前は" + fullName(firstName, lastName) + "です。");
		System.out.println("年齢は" + age + "歳です。");
		if (age >= 20) {
			System.out.println("成人です。");
		} else {
			System.out.println("未成年です。");
		}
		System.out.println("身長は" + height + "です。");
		System.out.println("体重は" + weight + "です。");
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
