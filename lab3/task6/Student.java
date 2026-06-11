package lab3.task6;

public class Student extends Person implements Scholar {
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
	
	public void study() { 
		System.out.println(name + " is reading books."); 
	}
	
	public void publishPaper() { 
		System.out.println(name + " published a lab report."); 
	}
}
