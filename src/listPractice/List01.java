package listPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Listとは、配列と同じようにインデックス番号の順序に要素（オブジェクト）を管理するコレクション

public class List01 {
	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();

		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();

		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");
		
		list2.add(1);
		list2.add(2);
		list2.add(3);

		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");

		// 要素を取得する
		list1.get(0);

		// 存在チェック (trueを返す)
		list1.contains("バナナ");

		// 存在チェック (falseを返す)
		list1.contains("なし");

		// コレクションの要素数の合計を取得
		list1.size();
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除される)
		list1.remove("バナナ");
		// list1.remove("なし"); // 何もしない
		
		// 位置を指定して要素を削除する
		list1.remove(0);
		// list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー
		
		
		System.out.println(list1); // 実行結果 [みかん]
		System.out.println(list2); // 実行結果 [1, 2, 3]
	}
}

// ArrayListとLinkedListのそれぞれ特徴（例）

// ・インデックス指定で要素を取り出すのはArrayListの方が速い
// ・先頭から順に処理をするのはArrayListの方が速い
// ・要素の挿入はLinkedListの方が速い
// ・要素の削除はLinkedListの方が速い

// など。状況に応じ使い分けることが大事。

