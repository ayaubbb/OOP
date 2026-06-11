package lab3.task6;

public class Bird extends Animal implements Trainable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Chirp-Chirp!";
    }

    @Override
    public String toString() {
        return "Bird " + super.toString();
    }
    
    public void train() { 
    	System.out.println(name + " learns to fly to the hand."); 
    }
}