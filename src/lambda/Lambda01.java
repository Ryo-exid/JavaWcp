package lambda;

public class Lambda01 {
	public static void main(String[] args) {
		// ラムダ式を使って hello を実装
		Greeting01 greeting = () -> {
			return "こんにちは";
		};
		System.out.println(greeting.hello());
	}
}

// ラムダ式
// (引数) -> {処理};
