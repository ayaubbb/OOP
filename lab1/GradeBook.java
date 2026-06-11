package lab1;
import practice2.Student;
import java.util.ArrayList;

import lab1.task4.Course;

public class GradeBook {
	private Course course;
	private ArrayList<Student> students;
	private ArrayList<Integer> grades;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
		this.grades = new ArrayList<>();
	}
	
	public void addStudent(Student student, int grade) {
		students.add(student);
		grades.add(grade);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.getName() + "!" + "\n");
	}
	
	public double determineClassAverage() {
		double total = 0;
		for(int grade : grades) {
			total += grade;
		}
		return grades.isEmpty() ? 0 : total / grades.size();
	}
	
	public void displayGradeReport() {
		if (grades.isEmpty()) return;
		
		int lowGrade = grades.get(0);
		int highGrade = grades.get(0);
		Student worstStudent = students.get(0);
		Student bestStudent = students.get(0);
		
		for(int i = 0; i < grades.size(); i++) {
			if (grades.get(i) < lowGrade) {
				lowGrade = grades.get(i);
				worstStudent = students.get(i);
			}
			else if (grades.get(i) > highGrade) {
				highGrade = grades.get(i);
				bestStudent = students.get(i);
			}
		}
		
		System.out.printf("\n" + "Class average is %.2f. ", determineClassAverage());
        System.out.println("Lowest grade is " + lowGrade + " (" + worstStudent.getName() + ", id: " + worstStudent.getId() + ").");
        System.out.println("Highest grade is " + highGrade + " (" + bestStudent.getName() + ", id: " + bestStudent.getId() + ")."+ "\n");
        
        outputBarChart();
	}
	
	public void outputBarChart() {
		System.out.println("Grades distribution:");
		int[] frequency = new int[11];
		
		for(int grade : grades) {
			frequency[grade / 10]++;
		}
		
		for (int count = 0; count < frequency.length; count++) {
			if (count == 10) {
                System.out.print("100: ");
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println("\n");
		}
	}
	
	public String toString() {
        return "GradeBook for " + course;
    }
}
