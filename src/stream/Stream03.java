package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {
	public static void main(String[] args) {
		// フルーツのリストを作成
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));
		
		// 在庫数が10以下のフルーツの個数
		long count = fruits.stream()
			.filter(f -> f.quantity <= 10)
			.count();
		System.out.println(count);
		
		// 個数の多い順に並べたフルーツのリスト
		List<Fruit> sortedFruits = fruits.stream()
			.sorted((f1, f2) -> f2.quantity - f1.quantity)
			.collect(Collectors.toList());
		System.out.println(sortedFruits);
	}
}
