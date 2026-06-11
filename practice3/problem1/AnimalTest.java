package practice3.problem1;
import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next(); 
		System.out.println("Enter year: ");
		int year = sc.nextInt(); 
		System.out.println("Enter color: ");
		String color = sc.next();
		System.out.println("Enter jump distance: ");
		int distanceOfJump = sc.nextInt();
		System.out.println("Enter eatten deers: ");
		int eattenDeers = sc.nextInt();

		Panthera p = new Panthera(name, year, color, distanceOfJump, eattenDeers);
		System.out.println(p.toString());
		
		System.out.println("legs: " + p.numberOfLegs());
		System.out.println("panthers legs: " + p.numberOfLegs(2, 2));
	}

}
