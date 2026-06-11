package practice4;

public class Student extends Person implements CanHavePizza {
	double gpa;
	public Student(String name, int age,double gpa) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.gpa = gpa;
	}

	@Override
	public void eatPizza() {
		// TODO Auto-generated method stub
		System.out.println("Student " +name+" is eating pizza with size "+PIZZASIZE);
	}
	
	public void surprize() {
		if(gpa >= 3.0) {
			System.out.println(name + " get free pizza for studying well!");
		}else {
            System.out.println(name + " study harder!");
        }
	}

}
