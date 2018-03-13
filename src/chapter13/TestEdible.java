package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 1:23:33 PM
 */
public class TestEdible {
	public static void main(String[] args) {
		Object[] objects = {new Tiger(), new Chicken(), new Apple()};
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Edible)
				System.out.println(((Edible)objects[i]).howToEat());
			
			if (objects[i] instanceof Animal) {
				System.out.println(((Animal)objects[i]).sound());
			}
		}
	}
}

abstract class Animal{
	/** Return animal sound */
	public abstract String sound();
}

class Chicken extends Animal implements Edible{
	@Override
	public String howToEat() {
		return "Chicken: Fry it";
	}
	
	@Override
	public String sound() {
		return "Chicken: cock-adoodle-do";
	}
}

class Tiger extends Animal{
	@Override
	public String sound() {
		return "Tiger: ROOOAAAARRRR";
	}
}

abstract class Fruit implements Edible{
	// Data fields, constructors and methods omitted here
}

class Apple extends Fruit{
	@Override
	public String howToEat() {
		return "Apple: Make apple cider";
	}
}
