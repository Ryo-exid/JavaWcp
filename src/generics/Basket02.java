package generics;

import java.math.BigDecimal;

// Fruitのサブクラスしか受け取れないよう、extendsキーワードを用いて次のように定義
class Basket02 <E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100); // 籠代が100円（初期値）
	
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
	
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です");
	}
}
