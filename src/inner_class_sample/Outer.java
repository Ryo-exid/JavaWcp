package inner_class_sample;

public class Outer {
	// 外部クラスに定義したフィールドgreeting
	private String greeting = "こんにちは";
	
	public class Inner {
		public String hello() {
			// 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			return greeting;
		}
	}
}

// 内部クラス

// staticクラスは、クラス外から直接インスタンス化できる
// 非staticクラスは、外部クラスのインスタンスからのみインスタンス化できる



// 内部クラスがstatic

// public class Outer {
//	   public static class Inner {
//     }
// }
