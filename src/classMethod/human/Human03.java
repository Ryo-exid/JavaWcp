package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	// コンストラクタ
	public Human03() {
		this.name = "瀬戸口";
		this.age = 24;
		this.profession = "プログラマー";
	}
	
	// String型の戻り値を返す引数なしのメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}
	
	// 戻り値を返さない、String型の引数を一つ取るメソッドを定義  ※戻り値が無いメソッド（voidメソッド）= 値を返さない
	public void greet(String friend) {
		if (friend == null) { // nullをそのまま扱うと、NullPointerExceptionを始め様々なエラーのもととなるためチェック
			System.out.println("挨拶する友達がいません！");
			return; // returnキーワードでメソッドを抜ける（voidメソッドなので戻り値を指定しない） ※void以外はreturn 〜；と、値を返さないとコンパイルエラーになる
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
