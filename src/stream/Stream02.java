package stream;

import java.util.ArrayList;
import java.util.List;

public class Stream02 {
	public static void main(String[] args) {
		// フルーツのリストを作成
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));
		
		// ラムダ式  ※1行での表記も可能だが、可読性を考慮する
		fruits.stream() // Streamを生成
		    .filter(f -> f.quantity <= 10) // 個数が10個以下のものを抽出（中間操作1）
		    .map(f -> f.order(20)) // 20個ずつ発注（中間操作2）
		    .sorted((f1, f2) -> f1.quantity - f2.quantity) // 個数の少ない順に並び替え（中間操作3）
		    .forEach(System.out::println); // 標準出力（終端操作）
	}
};