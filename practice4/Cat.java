package practice4;

public class Cat extends Animal implements CanHavePizza {

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPizza() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating pizza with size "+PIZZASIZE);
	}

}
