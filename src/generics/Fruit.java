package generics;

abstract class Fruit {
	String name;
	
	Fruit(String name) {
		this.name = name;
	}
	
	abstract protected String getName();
}
