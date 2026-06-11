package practice3.problem2;
import java.util.Vector;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Person> users = new Vector<>();
	
		while(true) {
			System.out.println("Enter 'i' for PRINT INFO ABOUT ALL ADDED PERSONS. Or 'a' for ADD NEW PERSON");
			String input = sc.next();
			
			if(input.equals("i")) {
				for(Person p : users) {
					System.out.println(p.toString());
				}
			} else if (input.equals("a")) {
			    System.out.println("Enter 'p' for Person, 'e' for Employee, 's' for Student: ");
			    String adding = sc.next();

			    System.out.println("Enter name and address:");
			    String name = sc.next();
			    String address = sc.next();

			    if (adding.equals("p")) {
			    	Person p = new Person(name, address);
			        users.add(p);
			        
			    } else if (adding.equals("e")) {
			        System.out.println("Enter school and pay:");
			        String school = sc.next();
			        double pay = sc.nextDouble();
			        Staff stf = new Staff(name, address, school, pay);
			        users.add(stf); 
			        
			    } else if (adding.equals("s")) {
			        System.out.println("Enter program, year and fee:");
			        String program = sc.next();
			        int year = sc.nextInt();
			        double fee = sc.nextDouble();
			        Student s = new Student(name, address, program, year, fee);
			        users.add(s);
			    }else { System.out.println("Invalid input!");}
			    
			} else { System.out.println("Invalid input!"); break; }
		}
	}
}