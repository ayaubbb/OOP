package practice3.problem1;

public class Animal {
	private String name;
	private int year;
	private String color;
	public String voice;
	
	public Animal(String name, int year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	public Animal() {
		voice = "no_voice_yet";
	} 
	
	public Animal(String initialVoice) {
		this.voice = initialVoice;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVoice(String newVoice) {
		voice = newVoice;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public String numberOfLegs() {
	    return "animals  usually have 4 legs";//l
	}
	
	public String toString() {
		return "This is " + name + " animal. " + "It is " + year + "s old. " + "It is " + color;//r
	}
	
}
