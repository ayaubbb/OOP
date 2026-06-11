package practice4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant dodopizza = new Restaurant();
		
		Cat seka = new Cat();
		Student stud = new Student("Ayaulym", 19, 3.5); 
		Student stude = new Student("Tima", 28, 2.9);
		
		dodopizza.servePizza(seka);
		dodopizza.servePizza(stud);
		dodopizza.servePizza(stude);
	}

}
