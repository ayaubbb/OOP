package lab3.task6;
import java.util.*;

public class Employee extends Person {
	private double salary;
    private Date hireDate;
    private String insuranceNumber;
    private String jobTitle;
	public Employee(String name, int age, String jobTitle) {
		super(name,age);
		// TODO Auto-generated constructor stub
		this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
        this.jobTitle = jobTitle;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() { 
		return hireDate; 
	}
	
    public String getInsuranceNumber() { 
    	return insuranceNumber; 
    }
    
    public String toString() {
        return super.toString() + " " + jobTitle;
    }
    
    public boolean equals(Object o) {
        if (!super.equals(o)) return false; 
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(hireDate, employee.hireDate) &&
               Objects.equals(insuranceNumber, employee.insuranceNumber);
    }
    
    public int compareTo(Employee other) {
    	if(this.salary < other.salary) return -1;
    	if(this.salary > other.salary) return 1;
    	return 0;
    }
    
    public String getOccupation() {
        return "Employee working as " + jobTitle;
    }
    
    
}