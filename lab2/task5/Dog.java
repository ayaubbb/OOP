package lab2.task5;

public class Dog extends Animal {

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
}
