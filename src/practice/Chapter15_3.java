package practice;

public class Chapter15_3 {
	public static void main(String[] args) {
		int i1 = 123;
		double d1 = i1; // データサイズが小さい型から大きい型は暗黙的にキャストされる
		System.out.println(d1);
		
		double d2 = 12.345;
		int i2 = (int) d2; // データサイズが大きい型から小さい型への代入は明示的にキャストしないとコンパイルエラー
		System.out.println(i2);
		
		int i3 = 1;
		int i4 = 2;
		double d3 = (double) i3 / i4; // キャストしないと期待の結果にならない ※どちらかの変数を浮動小数型のdouble型にキャストして、計算結果をdouble型にしないと小数点以下が切り捨てられてしまう
		System.out.println(d3);
		
		int i5 = 128;
		byte b1 = (byte) i5; // 大きい型から小さい型への代入なので、明示的にキャストする必要がある ※データサイズの上限値を超えてしまうことを「桁あふれ（オーバーフロー）」と言う
		System.out.println(b1);
	}
}
