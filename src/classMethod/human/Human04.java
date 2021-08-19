package classMethod.human;

public class Human04 {
	// static変数（インスタンスを生成せずに使える変数）
	static public int humanCount = 0;
	
	public String name;
	public static final String GREETING = "こんばんは"; // 定数（初期化）
	
	// コンストラクタ
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++; // インスタンス生成ごとにstatic変数をインクリメント
	}
	
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human04.humanCount); // static変数のhumanCountを表示
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}
}
