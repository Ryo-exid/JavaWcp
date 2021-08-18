package classMethod.human;

// アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義
public class Human01 {
	// アクセス修飾子publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義
	public String name; // メンバー変数
	public int age; // メンバー変数
	
	// 引数なしのコンストラクタを定義。これを用いて初期化した場合、nameは「山田」、ageは「20」という値で初期化される(それぞれ変数にセットされる)
	public Human01() {
		name = "山田";
		age = 20;
	}
	
	// 引数2つのコンストラクタを定義
	public Human01(String name, int age) {
		this.name = name; // this変数(自分自身のインスタンスを指す変数を扱う)
		this.age = age;
	}
}

// ClassMethod01.javaで実行