package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Mapとは、「キー」と「値」の組み合わせで要素を管理するコレクション

public class Map01 {
	public static void main(String[] args) {
		// HashMapを生成する場合
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(1, "いちご");
		map1.put(2, "めろん");
		map1.put(3, "もも");
		
		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
		// 要素を取得する
		map1.get(0);
		map1.get(1);
		
		// キーの存在チェック (trueを返す)
		map1.containsKey(0);
		
		// 値の存在チェック (falseを返す)
		map1.containsValue("ぶどう");
		
		// コレクションの要素数の合計を取得
		map1.size();
		
		// キーを指定して要素を削除する
		map1.remove(0);
		
		// キーと値を指定して要素を削除する
		map1.remove(3, "もも");
		
		
		System.out.println(map1); // 実行結果 {1=いちご, 2=めろん}
		
		// TreeMapを生成する場合
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map2.put("猫", "ミケ");
		System.out.println(map2);
	}
}
