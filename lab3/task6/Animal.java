package lab3.task6;
import java.io.Serializable;
public abstract class Animal implements Serializable {
	protected String name;
	protected int age;
	public Animal(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	abstract String getSound();
	
	public String toString() { 
		return "`s name is " + name + " age is " + age;
	}
}
