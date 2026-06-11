package Midterm;

public class Teacher extends Person {
	public double salary;
	public String subject;
	public Teacher(String name,int age,double salary,String subject) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.salary= salary;
		this.subject = subject;
	}
	public boolean equals(Object obj) {
		if (this== obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Teacher tea = (Teacher) obj;
		return salary == tea.salary && this.subject.equals(tea.subject);
	}
	public String toString() {
		return super.toString() + "my salary" + salary + "my subject" + subject;
	}
}
