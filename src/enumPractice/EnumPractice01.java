package enumPractice;

public class EnumPractice01 {
	public static void main(String[] args) {
		
		// Dessert.javaで列挙した定数の呼び出し
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);
		
		// 列挙した定数名そのものをString型で返すメソッドname()
		System.out.println(Dessert.APPLE.name());
	}
}
