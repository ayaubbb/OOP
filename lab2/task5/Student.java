package lab2.task5;

public class Student extends Person {
	private String major;
	public Student(String name, int age, String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.major = major;
	}

	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return "Student in " + major;
	}
	public String getMajor() {
        return major;
    }
	public String toString() {
		return super.toString() + " Major is " + major;
	}
}
