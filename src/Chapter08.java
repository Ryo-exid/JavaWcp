
public class Chapter08 {
	public static void main(String[] args) {
		// 1以上5未満の数の2乗を出力
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		int array[] = { 1, 4, 14, 25 }; // 要素数が4の「int」配列を初期化
		// 配列のサイズ分ループして、要素を出力
		for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
		
		// 拡張「for」文
		for (int val : array) {
			// 要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }		
	}
}
