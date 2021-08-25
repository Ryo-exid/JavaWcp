package extend;

import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {
		
		Dog dog = new Dog(); // Dogクラスのインスタンスを生成
		dog.eat(); // 抽象クラス（Animalクラス）のメソッドを呼び出し
		dog.cry(); // 抽象メソッドを実装したメソッドを呼び出し
		
		// 抽象クラスはインスタンス生成するとコンパイルエラー
        // Animal animal = new Animal();
	}
}
