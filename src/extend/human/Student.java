package extend.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age); // 最初にスーパークラスのコンストラクタを呼び出す
		this.score = score;
	}
	
	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "歳です。"; // super.フィールドは親インスタンスのフィールドを参照
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}


// 継承するクラスの基本構文

// 修飾子 class クラス名 extends スーパークラス名 {
//     // サブクラスの処理
// }



// --------------------------------------------

// final修飾子が指定されたクラスは継承が禁止

// final修飾子を指定
// final public class Human {
// }

//Humanが継承禁止のため、コンパイルエラー
// final public class Employee extends Human {
// }
