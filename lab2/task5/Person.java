package lab2.task5;

import java.util.Objects;

public abstract class Person {
	protected String name;
	protected int age;
	private Animal pet;
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public abstract String getOccupation();
	public Animal getPet() {
		return pet;
	}
	public void assignPet(Animal pet) {
		this.pet = pet;
	}
	public void removePet() {
		this.pet = null;
	}
	public boolean hasPet() {
		return pet != null;
	}
	public void leavePetWith(Person caretaker) {
		if (!this.hasPet()) {
		    System.out.println(name + " has no pet to leave!");
		    return;
		}
		caretaker.assignPet(this.pet);
		if (caretaker.hasPet()) this.removePet(); 
	}
	public void retrievePetFrom(Person caretaker) {
		this.assignPet(caretaker.getPet());
		caretaker.removePet();
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Person pers = (Person) o;
		return pers.age == age && this.name.equals(pers.name);
	}
	public int hashCode() {
		return Objects.hash(age, name);
		
	}
	public String toString() {
		if (pet == null) return "Name is " + name + " age is " + age;
		return "Name is " + name + " age is " + age + " pet is " + pet;
		
	}
}
