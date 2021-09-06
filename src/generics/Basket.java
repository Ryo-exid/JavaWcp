package generics;

class Basket<E> {
	private E elem;
	
	Basket(E e) {
		elem = e ;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
}

// 慣習的に、型パラメータにはelement(要素)の Eやtype(型)の Tなど、大文字の英字1文字を用いることが多い
