package enumPractice;

public enum Dessert {
	// それぞれに値段を指定する
	APPLE(100), ICE_CREAM(200), CAKE(300),;
	
	// 値段を保持するフィールド
	private int price;
	
	// コンストラクタを追加。引数はint型の値段。
	private Dessert(int price) {
		this.price = price;
	}
	
	// 値段を取得するメソッドを追加
	public int getPrice() {
		return price;
	}
	
}

// Enum（列挙型）とは、プログラムの中で定義する定数を拡張し、さらに安全かつ便利にする仕組み

// public static final String APPLE = "りんご";
// と、上記のような形よりも簡潔に書くことができる
