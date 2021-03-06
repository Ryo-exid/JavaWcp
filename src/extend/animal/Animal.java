package extend.animal;

//abstract修飾子を設定して、抽象クラスとして宣言
public abstract class Animal {
	protected String name; // protectedはサブクラスからもアクセス可能
	
	// 共通メソッドを記述
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
	// 抽象メソッド  ※サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}


// 抽象クラスとは、抽象メソッドを1つ以上持つクラスのこと
// 抽象メソッドとは、処理を記述せずにメソッド名や引数、戻り値だけを定義したメソッドのこと（「abstract」修飾子を指定すると抽象メソッドになる）


//基本構文

//抽象クラスの宣言
//アクセス修飾子 abstract class クラス名 {
//  // 抽象クラスの基本構文
//  アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
//}
