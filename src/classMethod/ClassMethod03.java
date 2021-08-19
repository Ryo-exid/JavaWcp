package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 setoguchi = new Human03(); // Human03クラスのインスタンスを生成
		System.out.println("私の名前は、" + setoguchi.name + "です。");
		
		String profile = setoguchi.getProfile(); // インスタンス.メソッドを変数に代入
		System.out.println(profile + "です。");
		
		setoguchi.greet("Nissy"); // インスタンス.メソッド("引数");
		setoguchi.greet(null);
	}
}
