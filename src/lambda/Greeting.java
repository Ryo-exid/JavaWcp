package lambda;

@FunctionalInterface  // 関数型インターフェースであると明示（明示的にアノテーションを付けておくことによって、不用意にメソッドを増やされてしまうのを防ぐ）
public interface Greeting {
	public String hello(); // 抽象メソッド1つのみ
}

// 「関数型インターフェース」とは、実装すべき抽象メソッドが1つしかないインターフェースのこと
