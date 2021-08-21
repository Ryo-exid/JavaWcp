package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human setoguchi = new Human("瀬戸口", 24); // Humanクラスのインスタンスを生成
		System.out.println("Humanクラスのメソッド：名前は、" + setoguchi.getName());
		
		Student ikeda = new Student("池田", 18, 70); // Studentクラスのインスタンスを生成
		System.out.println("Humanクラスのメソッド：名前は、" + ikeda.getName()); // サブクラスのインスタンスからスーパークラス（Humanクラス）のメソッドを呼び出し
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + ikeda.getStudentProfile()); // Studentクラスに追加したgetStudentProfileメソッドを呼び出し
		
		Human human = new Employee("篠原", 28, "システム部"); // Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数に代入
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName()); // スーパークラス（Humanクラス）のメソッドを呼び出し
		
		// Humanクラスには、getEmployeeProfileメソッドがないのでアクセスするとコンパイルエラー
		// System.out.println("Employeeクラスのメソッド：" + human.getEmployeeProfile());
		Employee shinohara = (Employee) human; // ダウンキャスト（スーパークラスからサブクラスに代入すること）は明示的に記述しなければならない。
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + shinohara.getEmployeeProfile());
		
		// printNameメソッドを呼び出して、名前を表示
		Extend01.printName(setoguchi);
		Extend01.printName(ikeda);
		Extend01.printName(shinohara);
	}
	
	// 引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}


// アップキャスト（サブクラスのインスタンスをスーパークラスの変数に代入すること）、ダウンキャスト

// SubClass subclass = new SubClass();
// アップキャスト
// SuperClass upCastClass = subclass;
// ダウンキャスト
// SubClass downCastClass = (SubClass) upCastClass;