package extend.phone;

// Phoneインターフェースの宣言
public interface Phone {
	final int MAX_NUMBER_DIGITS = 11; // フィールドの宣言（定数）
	
	// public abstractが自動で追加される（抽象メソッド）
	public void call(String number);
	
	// defaultメソッドの宣言
	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}

// インターフェースとは、定数と抽象メソッドだけを持つクラスのようなもの。
// インターフェースはクラスで実装して利用する。
// 実装したクラスはインターフェース内の抽象メソッドを実装する必要がある。


// インターフェースの基本構文

// [public] interface インターフェース名 extends インターフェース名, インターフェース名 {
//     // フィールドの宣言（定数）
//     (public static final) 定数の型 定数名 = 初期値;
//     // メソッドの宣言（抽象メソッド）
//     (public abstract) 戻り値の型 メソッド名(引数);
// }
