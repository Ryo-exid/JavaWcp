package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 seto = new Human04("せと"); // インスタンスを生成（コンストラクタ内の処理が実行される）
		
		// 静的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();
		
		// staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
		// インスタンスメンバーはインスタンス生成してから使用できる（インスタンスを生成しないとコンパイルエラーになる）
		seto.instanceMethodPrint();
	}
}
