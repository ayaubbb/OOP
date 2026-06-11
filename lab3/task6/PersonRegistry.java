package lab3.task6;
import java.util.ArrayList;
import java.util.*;
import java.io.Serializable;
import java.util.Collections;
public class PersonRegistry implements Serializable {
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
        StringBuilder sb = new StringBuilder("Registry Details:\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void sortPeopleByAge() {
        Collections.sort(people); 
    }
}