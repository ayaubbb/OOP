package lab3.task4;
import java.util.*;
public class Manager extends Employee {
	private Vector<Employee> team;
    private double bonus;
	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.team = new Vector<>();
        this.bonus = 0;
	}
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

	public void addEmployeeToTeam(Employee e) {
		team.add(e);
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() { 
		return bonus; 
	}
	
	public String toString() {
        return super.toString() + ", Manager bonus " + bonus + ", teamSize " + team.size();
    }
	
	public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 &&
               Objects.equals(team, manager.team);
    }
	
	public int compareTo(Employee other) {
        int result = super.compareTo(other);
        if (result == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return result;
    }
	
	public Manager clone() {
        Manager copy = (Manager) super.clone(); 
        copy.team = new Vector<>(this.team);   
        return copy;
    }
}
