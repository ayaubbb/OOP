package lab3.task6;

public class Dog extends Animal implements Trainable {

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getSound() {
		// TODO Auto-generated method stub
		return "Woof";
	}
	public String toString() {
        return "Dog " + super.toString();
    }
	
	public void train() { 
		System.out.println(name + " learns a new trick!"); 
	}
}
