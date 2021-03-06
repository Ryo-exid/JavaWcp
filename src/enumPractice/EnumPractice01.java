package enumPractice;

public class EnumPractice01 {
	public static void main(String[] args) {
		
		// Dessert.javaで列挙した定数の呼び出し
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);
		
		// 列挙した定数名そのものをString型で返すメソッドname() ※列挙型のメソッド
		System.out.println(Dessert.APPLE.name());
		
		// 列強した順序をint型で返すメソッドordinal()  ※（0スタート）
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
		
		// 定義した値段を取得するメソッドでの呼び出し
		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.getPrice());
		System.out.println(Dessert.CAKE.getPrice());
		
		
		// インスタンスごとに実装したメソッドを実行
		Food.FRENCH_FRIES.advertise();
		Food.BURGER.advertise();
		Food.NUGGET.advertise();
	}
}

// valueOf()  ※name()とは逆に、String型の名称から列挙型のインスタンスを取得したい場合

// Dessert apple = Dessert.valueOf("APPLE");  ※valueOf()に列挙されていない文字列を指定すると例外が発生するため注意
// System.out.println(apple);
