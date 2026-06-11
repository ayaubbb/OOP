package lab3.task4;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    	Date date1 = new Date(120, 1, 1);  
        Date date2 = new Date(118, 3, 10); 
      
        Employee e1 = new Employee("Beisen",  3000, date1, "INS-001");
        Employee e2 = new Employee("Ayaulym", 5000, date2, "INS-002");

        Manager m1 = new Manager("Tima", 3000, date2, "INS-MGR", 1000);
        Manager m2 = new Manager("Aibek", 3000, date1, "INS-MGR2", 500);

        System.out.println(e1);
        System.out.println(m1);

        System.out.println("e1.equals(e2): " + e1.equals(e2)); // f
        System.out.println("e1.equals(e1): " + e1.equals(e1)); // t

        System.out.println("e1 vs e2: " + e1.compareTo(e2)); // -1
        System.out.println("m1 vs m2: " + m1.compareTo(m2)); // 1

        Vector<Employee> list = new Vector<>();
        list.add(e2); list.add(e1);
        Collections.sort(list);
        for (Employee e : list) System.out.println(e.getName() + " " + e.getSalary());

        list.sort(Employee.nameComparator());
        for (Employee e : list) System.out.println(e.getName());
        
        Employee copy = e1.clone();
        System.out.println("same ref: " + (e1 == copy));        // f
        System.out.println("equal:    " + e1.equals(copy));     // t
        
        m1.addEmployeeToTeam(e1);
        Manager mcopy = m1.clone();
        mcopy.addEmployeeToTeam(e2);
        System.out.println("m1 teamSize:   " + m1.toString());    // 1
        System.out.println("mcopy teamSize:" + mcopy.toString()); // 2
    }
}