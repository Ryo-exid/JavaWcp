package anonymousClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Anonymous02 {
	public static void main(String[] args) {
		// 並び替え対象のリスト
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
		
		Collections.sort(
			animals,
			new Comparator<String>() {
				@Override
				public int compare(String x, String y) {
					// 数値が小さい順（アルファベット順）に並べる
					return x.compareTo(y);
				}
			}
		);
		System.out.println(animals); // [cat, dog, elephant, fox]
	}
}

// 比較するもの.compareTo(比較されるもの)
// →大小比較した結果の整数が戻る

// 比較するもの < 比較されるもの：-1以下の整数
// 比較するもの = 比較されるもの：0
// 比較するもの > 比較されるもの：1以上の整数
