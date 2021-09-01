package inner_class_sample;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer(); // クラスOuterをインスタンス化
		Outer.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化（内部クラスが非staticな場合）
		
		// 内部クラスがstaticだった場合のインスタンス化
		// Outer.Inner inner = new Outer.Inner();
	}
}

// staticな内部クラスBをインスタンス化する場合は、 new Outer.Inner() のように書くことで直接インスタンス化可能。
// または、import inner_class_sample.Outer.Inner; とimport文を書けば
// new Inner() のみでインスタンスを生成することが可能
