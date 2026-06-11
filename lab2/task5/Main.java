package lab2.task5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PhDStudent("Alice", 26, "Comp. Science","AI");
		Animal murka = new Cat("Murka", 5);
		john.assignPet(murka); // John owns Rex
		PersonRegistry registry = new PersonRegistry();
		registry.addPerson(john);
		registry.addPerson(alice);
		// John goes on vacation and leaves Rex with Alice
		john.leavePetWith(alice);
		// Registry reflects that Alice is taking care of Rex
		registry.printPeopleWithPets();
		// John returns from vacation and retrieves Rex
		john.retrievePetFrom(alice);
		// Registry reflects that John has his dog back
		registry.printPeopleWithPets();
	}

}
