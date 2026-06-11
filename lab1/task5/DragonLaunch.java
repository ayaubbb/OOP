package lab1.task5;
import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> studentLine;

    public DragonLaunch() {
        this.studentLine = new Vector<>();
    }

    public void kidnap(Person p) {
        studentLine.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boysWaiting = 0;

        for (Person p : studentLine) {
            if (p.getGender() == Gender.BOY) {
                boysWaiting++;
            } else {
                if (boysWaiting > 0) {
                    boysWaiting--;
                } else {
                    return true; 
                }
            }
        }
        
        return boysWaiting > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();
        
        dl.kidnap(new Person(Gender.GIRL, "Alibi"));
        dl.kidnap(new Person(Gender.BOY, "Sanzhar"));
        dl.kidnap(new Person(Gender.GIRL, "Aigerim"));
        dl.kidnap(new Person(Gender.BOY, "Madina"));

        System.out.println("Line: " + dl.studentLine);
        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will have a lunch!");
        } else {
            System.out.println("No one left for the dragon.");
        }
    }
}
