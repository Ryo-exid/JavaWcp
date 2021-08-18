
public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long num1 = 123456L;
		System.out.println(num1);
		
		double num2 = 3.14;
		System.out.println(num2);
		
		boolean num3 = true;
		System.out.println(num3);
		
		// ラッパークラス型の「Float」「Integer」「Character」の変数に値を代入して出力（プリミティブ型をラッパークラス型に変えることをボクシングという）
		Float num4 = 1.4142f; // ラッパークラスをオートボクシング（メソッドを使って明示的に呼び出さなくても変換が実行されること）で初期化して出力
		System.out.println(num4);
		
		Integer num5 = 25;
		System.out.println(num5);
		
		Character c = 'あ';
		System.out.println(c);
		
		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array = { 0, 10, 20, 30, 40 };
		System.out.println(array[3]);
	}
}
