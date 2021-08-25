
public class OddNumber {
	public static void main(String[] args) {
		// 0〜100までの繰り返し
		for (int i = 0; i <= 100; i++) {
			// 2で割ったあまりが0以外
			if (i % 2 != 0) {
				System.out.println(i + "は奇数です。");
			}
		}
	}
}
