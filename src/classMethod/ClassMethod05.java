package classMethod;

import classMethod.human.Human05;

public class ClassMethod05 {
	public static void main(String[] args) {
		Human05 setoguchi = new Human05(); // インスタンス生成
		
		// nameとageはprivateな変数なので直接参照はできない
		// nameとageそれぞれの値を返すpublicなメソッドを通して参照し出力することはできる
		System.out.println("名前は" + setoguchi.getName() + "です。年齢は" + setoguchi.getAge() + "です。");
	}
}
