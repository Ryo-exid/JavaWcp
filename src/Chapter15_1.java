//再帰（再帰呼び出し、再帰処理）とは、あるメソッドの中から自分自身のメソッドを呼び出す処理のこと。

public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}
	
	// ユークリッドの互除法で最大公約数を計算するメソッド
	static int gcd(int a, int b) {
		// b(余り)が0になった時のaが最大公約数
		if (b == 0) {
			return a;
		}		
		// 余りが0で無い場合は下記の処理を行い、余りが0になれば上記処理が実行される		
		return gcd(b, a % b); // 再帰呼び出し
	}
}

// ※ ユークリッドの互除法の計算方法
// 大きい数を小さい数（割った数）で割り、割った数を余りで割る。さらに割った数を余りで割り、余りが0になるまで計算。余りが0になった時の割った数が最大公約数となる。

// 例）148 と 28 の最大公約数
//　148 % 28 = 16　← 大きい数（148）を小さい数（28）で割る
//　28 % 16 = 12　 ← 割った数（28）を余り（16）で割る
//　16 % 12 = 4 　 ← さらに割った数（16）を余り（12）で割る
//　12 % 4 = 0   　← さらに計算して、余りが0になった時の割った数（4）が最大公約数