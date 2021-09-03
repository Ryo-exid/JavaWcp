package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// どのコレクションも、拡張for文を用いることで順番に要素を取り出し処理を行うことができる

public class For01 {
	public static void main(String[] args) {
		// Listの例
		List<String> prefectures = new ArrayList<String>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		
		for (String prefecture : prefectures) {
			System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
		}
		
		
		// Mapの例
		Map<Integer, String> classMates = new HashMap<>();
		classMates.put(1, "青木");
		classMates.put(2, "伊藤");
		classMates.put(3, "宇田川");
		
		// キーのみ
		for (Integer key : classMates.keySet()) {
			System.out.println(key); // 1, 2, 3の順に表示
		}
		
		// 値のみ
		for (String name : classMates.values()) {
			System.out.println(name); // 青木、伊藤、宇田川の順に表示
		}
		
		// キーと値のペア
		for (Map.Entry<Integer, String> classMate : classMates.entrySet()) {
			// 1番は青木さん、2番は伊藤さん、3番は宇田川さんの順に表示
			System.out.println(classMate.getKey() + "番は" + classMate.getValue() + "さん");
		}
	}
}
