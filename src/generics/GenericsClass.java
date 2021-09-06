package generics;

public class GenericsClass {
	public static void main(String[] args) {
		// Apple用のBasketを用意
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName()); // 出力
		
		// 中身を置き換えるために用意した replaceを使用
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
		
		// Peach用のBasketを用意
		Basket<Peach> peachBasket = new Basket<>(new Peach("白桃"));
		System.out.println(peachBasket.get().getName());
	}
}
