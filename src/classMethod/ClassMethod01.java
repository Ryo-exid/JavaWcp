package classMethod;

import classMethod.human.Human01;

public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 yamada = new Human01(); // インスタンスのnameとageを表示すると、コンストラクタで代入した初期値が表示される
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。"); // 上記インスタンスのnameとageを表示すると、コンストラクタで代入した初期値が表示される
		
		Human01 sato = new Human01("佐藤", 25); // 引数2つのコンストラクタを用いてHuman01クラスのインスタンスを生成
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。"); // 上記インスタンスのnameとageを表示すると、コンストラクタの引数に渡した値が表示される
	}
}
