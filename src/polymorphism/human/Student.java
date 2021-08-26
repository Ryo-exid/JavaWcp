package polymorphism.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	// オーバーライドして、Studentクラス用に処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}

// サブクラス側のメソッドの直前の行に @Override と書くことで、下記すべてを満たしていることをコンパイル時に保証できる。
// ・メソッド名が同じである
// ・引数の型と数が同じである
// ・戻り値の型が同じか、スーパークラス・サブクラスの関係にある
// ・例外の型が同じか、スーパークラス・サブクラスの関係にある
// ・アクセス修飾子が同じか、スーパークラスの制約の方が厳しい

// @Overrideを書いておけば、1つでも欠けている条件があるとコンパイルエラーとなる。
