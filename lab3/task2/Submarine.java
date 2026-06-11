package lab3.task2;

public class Submarine implements Divable {
    private String model;

    public Submarine(String model) { 
    	this.model = model; 
    }

    @Override
    public void move() {
        System.out.println("submarine " + model + " has started its propellers and is on course");
    }

    @Override
    public void dive(int depth) {
        System.out.println("Filling ballast tanks " + model + " is submerged to " + depth + " m");
    }

    @Override
    public void surface() {
        System.out.println("Ballast blown. Boat emergently surfaced");
    }
}