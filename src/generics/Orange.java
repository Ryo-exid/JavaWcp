package generics;

class Orange extends Fruit {
	Orange(String name) {
		super(name);
	}

	@Override
	protected String getName() {
		return name;
	}
}
