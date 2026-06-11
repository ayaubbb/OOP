package lab2.task5;
import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }
    
    public void removePerson(Person p) {
        people.remove(p);
    }

    public void printPeopleWithPets() {
        System.out.println("People with pets");
        for (Person p : people) {
            if (p.hasPet()) {
                System.out.println(p.toString());
            }
        }
    }
    
    public void printPeopleWithoutPets() {
        System.out.println("People WITHOUT pets");
        for (Person p : people) {
            if (!p.hasPet()) {
                System.out.println(p.getName() + " is currently free.");
            }
        }
    }
    
    public void printPhDStudents() {
        System.out.println("PhD Students Registry");
        for (Person p : people) {
            if (p instanceof PhDStudent) {
                System.out.println(p.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "PersonRegistry contains " + people.size() + " people.";
    }
}