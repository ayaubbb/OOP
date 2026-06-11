package lab3.task4;
import java.util.*;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
    private Date hireDate;
    private String insuranceNumber;
	public Employee(String name,double salary,Date hireDate,String insuranceNumber) {
		super(name);
		// TODO Auto-generated constructor stub
		this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
	}
	
	public Employee(String name) {
        super(name);
        this.salary = 0;
        this.hireDate = new Date();
        this.insuranceNumber = "N/A";
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
        return super.toString() + ", Employee salary " + salary + 
               ", hireDate " + hireDate + ", insurance " + insuranceNumber;
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
    
    public Employee clone() {
    	try {
    		return (Employee) super.clone();
    	} catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }
    
    public static Comparator<Employee> nameComparator() {
        return Comparator.comparing(e -> e.name);
    }
    
    public static Comparator<Employee> hireDateComparator() {
        return Comparator.comparing(Employee::getHireDate);
    }
}