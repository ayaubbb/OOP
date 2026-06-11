package lab2.task5;

public class Employee extends Person {
	private String jobTitle;
	public Employee(String name, int age, String jobTitle) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.jobTitle = jobTitle;
	}

	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return "Employee working as " + jobTitle;
	}
	
	public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
    }

}
