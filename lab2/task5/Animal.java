package lab2.task5;

public abstract class Animal {
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
