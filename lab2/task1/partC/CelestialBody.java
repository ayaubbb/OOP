package lab2.task1.partC;

import java.util.Objects;

// Superclass definition
public class CelestialBody {   // Небесное тело
	private String name;
	private double mass;
	private String galaxy;
	// Getters, Setters, toString, equals, hashCode methods
	public CelestialBody(String name, double mass, String galaxy) {
	    this.name = name;
	    this.mass = mass;
	    this.galaxy = galaxy;
	}
	
	@Override
	public boolean equals(Object o) {
	// Custom equality check
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		
		CelestialBody body = (CelestialBody) o;
		return body.name.equals(name) && body.galaxy.equals(galaxy);
	}
	@Override
	public int hashCode() {
	// Custom hash code logic
		return Objects.hash(name, galaxy);
	}
	
	public String getName() {
		return name;
	}
	
	public String getGalaxy() {
		return galaxy;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setNewGalaxy(String newGalaxy) {
		this.galaxy = newGalaxy;
	}
	
	public void setNewMass(double newMass) {
		this.mass = newMass;
	}
	
	public String toString() {
		return "CelestialBody{name = " + name + ", mass = " + mass + ", galaxy = " + galaxy + "}";
	}//CelestialBody{name='Земля', mass=5.97E24, galaxy='Млечный Путь'}
}
// Subclass definition
