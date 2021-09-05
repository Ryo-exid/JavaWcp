package generics;
// ジェネリクス（型をパラメータとして抽象的に扱うことで、プログラムを汎用的に用いるためのしくみ）

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>(); // <>に囲まれた型を「型パラメータ」と呼ぶ  ※プリミティブ型を用いることができないので、参照型で宣言
		
		items.add("bag");
		// これ以下はString型ではない要素を追加しているのでコンパイルエラー
		// items.add(1);
		// items.add(true);
		
		// 要素を取り出す際は「キャスト」という処理を行い、括弧付きで型を指定することで型の変換が可能
		String item1 = (String)items.get(0); // ダウンキャスト（スーパークラスからサブクラスへの変換）
		
		System.out.println(item1); // bag
		System.out.println(items); // [bag]
	}
}

// 型を宣言しないと、すべてのクラスのスーパークラスである Object 型の要素を持ったListが生成される（どんな要素でも追加可能）
// List items = new ArrayList();　は　List<Object> items = new ArrayList<Object>();　のようなイメージ

// ある値を Object型として扱った場合、実際のところそれがどんな値なのかが分からなくなってしまう。 
// Listに追加するまでは持っていた Integer や String といった具体的な型の情報がなく、特定の型へのダウンキャストが成功するかどうかは実行してみるまで分からない。
// そうした型の相違をコンパイルの段階で検出するのに便利なのがジェネリクス。

// Listを宣言する際はジェネリクスを使った方が安全にできる。
