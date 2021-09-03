package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Setとは、重複のない要素を管理するコレクション。 ※重複した要素を保持することができず、要素の順番も保証されない

public class Set01 {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		set1.add("スイカ");
		set1.add("メロン");
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		// 存在チェック (trueを返す)
		set1.contains("スイカ");
		
		// 存在チェック (falseを返す)
		set1.contains("なし");
		
		set1.size(); // 2を返す
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		set1.remove("スイカ");
		set1.remove("なし"); // 何もしない
		
		System.out.println(set1); // 実行結果 [メロン]
		System.out.println(set2); // 実行結果 [1, 2, 3]
	}
}

// 「 同じ値のものは2つ以上持てない 」などの特性を生かして扱う。
