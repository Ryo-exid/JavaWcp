package extend.human;

//Humanクラスを継承したEmployeeクラス
public class Employee extends Human {
	private String department; // サブクラスで追加したフィールド
	
	public Employee(String name, int age, String department) {
		super(name, age); // スーパークラスのコンストラクタを呼び出し
		this.department = department;
	}
	
	// サブクラスで追加したメソッド
	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "歳です。"; // 親インスタンスのフィールドをthis変数で参照
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}
