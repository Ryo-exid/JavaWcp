package generics;

// Fruitのサブクラスしか受け取れないよう、extendsキーワードを用いて次のように定義
class Basket02 <E extends Fruit> {
	private E elem;
	
	Basket02(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です"); // EはFruitのサブクラスなので、getNameが使えると保証されている
	}
}
