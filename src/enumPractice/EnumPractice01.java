package enumPractice;

public class EnumPractice01 {
	public static void main(String[] args) {
		
		// Dessert.javaで列挙した定数の呼び出し
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);
		
		// 列挙した定数名そのものをString型で返すメソッドname() ※列挙型のメソッド
		System.out.println(Dessert.APPLE.name());
	}
}

// valueOf()  ※name()とは逆に、String型の名称から列挙型のインスタンスを取得したい場合

// Dessert apple = Dessert.valueOf("APPLE");  ※valueOf()に列挙されていない文字列を指定すると例外が発生するため注意
// System.out.println(apple);