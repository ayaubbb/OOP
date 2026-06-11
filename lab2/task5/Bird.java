package lab2.task5;

public class Bird extends Animal {
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
}