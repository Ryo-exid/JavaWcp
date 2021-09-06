package generics;

import java.math.BigDecimal;

public class GenericsClass02 {
	public static void main(String[] args) {
		Basket02<Orange> orangeBasket = new Basket02<>(new Orange("オレンジ", new BigDecimal(100)));
		Basket02<Grape> grapeBasket = new Basket02<>(new Grape("ぶどう", new BigDecimal(400)));
		
		orangeBasket.printTotalPrice();
		grapeBasket.printTotalPrice();
	}
}
