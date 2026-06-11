package practice3.problem1;

public class Panthera extends Animal {
	private int distanceOfJump;
	private int eattenDeers;
	
	public Panthera(String name, int year, String color, int distance, int eattenDeers) {
		super(name, year, color);
		this.voice = "Roar";
		this.distanceOfJump = distance;
		this.eattenDeers = eattenDeers;
	}
	
	public Panthera() {
        super();
        this.distanceOfJump = 0;
    }
	
	public String numberOfLegs(int front, int back) {
        return "It has " + front + " front legs and " + back + " back legs.";//l
    }
	
	public Panthera (String initialVoice) {
		super(initialVoice);
	}
	
	public int getDistanceOfJump() {
		return distanceOfJump;
	}
	
	public int getNumberOfEattenDeers() {
		return eattenDeers;
	}
	
	public String getVoice() {
	    return voice;
	}
	
	public String toString() {//r
		return super.toString() + ".\n" + " Jump: " + distanceOfJump + "m. Number of eaten deers: " + eattenDeers + " It says: " + getVoice();
	}
	
}
