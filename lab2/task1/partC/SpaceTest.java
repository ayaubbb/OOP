package lab2.task1.partC;
import java.util.HashSet;
public class SpaceTest {
    public static void main(String[] args) {
        Planet earth1 = new Planet("Earth", 5.97E24, "Milky Way", true, 365.25);
        Planet earth2 = new Planet("Earth", 5.97E24, "Milky Way", true, 365.25);
        Planet mars = new Planet("Mars", 6.39E23, "Milky Way", true, 687);
        
        HashSet<Planet> solarSystem = new HashSet<>();
        solarSystem.add(earth1);
        solarSystem.add(earth2);
        solarSystem.add(mars);
        
        System.out.println("Testing Earth 1 " + earth1);
        
        System.out.println("\nHashSet Duplicate Check");
        System.out.println("Number of planets in HashSet " + solarSystem.size());
        
        if (solarSystem.size() == 2) {
            System.out.println("Success Duplicates were correctly handled");
        } else {
            System.out.println("Failed HashSet contains duplicates");
        }
        
        for (Planet p : solarSystem) {
            System.out.println("In set: " + p.getName());
        }
    }
}
