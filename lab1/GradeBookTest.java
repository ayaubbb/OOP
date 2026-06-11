package lab1;
import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

import lab1.task4.Course;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Course oop = new Course("CS101 Object-oriented Programming", "Java Basics", 3, "None");
		GradeBook myGradeBook = new GradeBook(oop);
		
		myGradeBook.displayMessage();
		
		Student[] studentsList = {
			new Student("Student A", 1), new Student("Student B", 2),
	        new Student("Student C", 3), new Student("Student D", 4),
	        new Student("Student E", 5), new Student("Student F", 6),
	        new Student("Student G", 7), new Student("Student H", 8),
	        new Student("Student I", 9), new Student("Student J", 10),
		};
		
		System.out.println("Please, input grades for students:" + "\n");
		for (Student s : studentsList) {
            System.out.print(s.getName() + ": ");
            int g = input.nextInt();
            myGradeBook.addStudent(s, g);
        }

    
        myGradeBook.displayGradeReport();
		

	}

}
