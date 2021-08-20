package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human setoguchi = new Human("瀬戸口", 24);
		System.out.println("Humanクラスのメソッド：名前は、" + setoguchi.getName());
		
		Student ikeda = new Student("池田", 18, 70);
		System.out.println("Humanクラスのメソッド：名前は、" + ikeda.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + ikeda.getStudentProfile());
		
		Human human = new Employee("篠原", 28, "システム部");
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
		
		Employee shinohara = (Employee) human;
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + shinohara.getEmployeeProfile());
		
		Extend01.printName(setoguchi);
		Extend01.printName(ikeda);
		Extend01.printName(shinohara);
	}
	
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}
