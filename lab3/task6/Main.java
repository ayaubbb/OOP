package lab3.task6;
import java.io.*;
import java.util.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PersonRegistry registry = new PersonRegistry();
        Employee john = new Employee("John", 30, "Engineer");
        PhDStudent alice = new PhDStudent("Alice", 26, "CS", "AI");
        
        Dog rex = new Dog("Rex", 3);
        Bird tweetie = new Bird("Tweetie", 1);

        System.out.println("Pet Assignment");
        john.assignPet(rex);
        alice.assignPet(tweetie);
        
        System.out.println("\nleave Rex with Alice");
        john.leavePetWith(alice); 

        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("\nSorting by Age");
        registry.sortPeopleByAge();
        System.out.println(registry);

        String file = "registry.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(registry);
            System.out.println("\nRegistry saved to " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            PersonRegistry loaded = (PersonRegistry) ois.readObject();
            System.out.println("Registry loaded. People count: " + loaded.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
