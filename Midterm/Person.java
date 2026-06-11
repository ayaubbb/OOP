package Midterm;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		
	}
	public boolean equals(Object obj) {
		if (this== obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Person pers = (Person) obj;
		return age == pers.age && this.name.equals(pers.name);
	}
	public String toString() {
		return "my name " + name + " my age " + age;
	}

}
