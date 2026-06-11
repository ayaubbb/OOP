package practice4;

public class Restaurant {

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		
		if (eater instanceof Student) {
            ((Student) eater).surprize(); //d
        } else if (eater instanceof Person) {
            System.out.println("Processing payment for Person...");
        }
        return true;
	}
}