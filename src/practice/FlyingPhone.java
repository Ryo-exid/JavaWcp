package practice;

import extend.phone.Phone;

//Phone, Flyingインターフェースを実装したFlyingPhoneクラスの宣言
public class FlyingPhone implements  Phone, Flying {
	private int minutes; // フィールド
	
	// コンストラクタ
	public FlyingPhone (int minutes) {
		this.minutes = minutes;
	}
	
	// Phoneインターフェースのメソッドをオーバーライド
	public void call(String number) {
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	// Flyingインターフェースのメソッドをオーバーライド
	public void fly() {
		System.out.println(minutes + " 分間、飛びます。 ");
	}
	
	// オーバーライドしないとコンパイルエラー（PhoneとFlyingの両インターフェースにdefaultメソッドがあるため。）
	public void powerOff() {
		// Flyingのdefaultメソッドを呼び出す
		Flying.super.powerOff();
	}
}


// インターフェースを実装したクラスからdefaultメソッドを呼び出す基本構文

// インターフェース.super.デフォルトメソッド名();