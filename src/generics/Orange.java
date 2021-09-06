package generics;

import java.math.BigDecimal;

class Orange extends Fruit {
	Orange(String name, BigDecimal price) {
		super(name, price);
	}

	@Override
	protected String getName() {
		return name;
	}
	
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
}
