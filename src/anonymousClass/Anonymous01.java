package anonymousClass;

public class Anonymous01 {
	public static void main(String[] args) {
		// 通常の実行
		A a = new A();
		System.out.println(a.hello());
		
		// 無名クラス
		A b = new A() { // ()のあとに{}を追加
			// クラスAのhelloメソッドをオーバーライド
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
		
		
		// インターフェイスを実装する無名クラス（ごく局所的に使われるだけのクラスを、わざわざ1ファイルとして実装するのは手間 = 無名クラスで実装）
		B bb = new B() {
			@Override
			public String greeting() {
				return "Good morning!";
			}
		};
		System.out.println(bb.greeting());
	}
}
