package lab3.task4;
import java.util.*;
public class Person implements Cloneable {
	protected String name;
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name " + name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Person pers = (Person) o;
		return Objects.equals(name, pers.name);
	}
}
