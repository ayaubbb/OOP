package lab2.task1.partC;

import java.util.Objects;

public class Planet extends CelestialBody {
	private boolean hasAtmosphere;
	private double orbitalPeriod;//время обращения вокруг звезды
	// Override equals and hash code methods
	
	public Planet(String name, double mass, String galaxy, boolean hasAtmosphere, double orbitalPeriod) {
	    super(name, mass, galaxy);
	    this.hasAtmosphere = hasAtmosphere;
	    this.orbitalPeriod = orbitalPeriod;
	}
	@Override
	public boolean equals(Object o) {
	// Custom equality check
		if (!super.equals(o)) return false;
		
		Planet planet = (Planet) o;
		return planet.orbitalPeriod == orbitalPeriod && planet.hasAtmosphere == hasAtmosphere;
	}
	@Override
	public int hashCode() {
	// Custom hash code logic
		return Objects.hash(super.hashCode(), orbitalPeriod, hasAtmosphere);
	}
	
	public boolean getHasAtmosphere() {
		return hasAtmosphere;
	}
	
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public void setHasAtmosphere(boolean newHasAtmosphere) {
		this.hasAtmosphere = newHasAtmosphere;
	}
	
	public void setNeOrbitalPeriod(double newOrbitalPeriod) {
		this.orbitalPeriod = newOrbitalPeriod;
	}
	
	public String toString() {
		return "Planet{description = " + super.toString() + ", orbitalPeriod = " + orbitalPeriod + "}";
	}
	
} // do not forget test class
