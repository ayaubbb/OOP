package practice2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ayaulym", 1);
		System.out.println("Name: " + s1.getName());
		System.out.println("Id: " + s1.getId());
		System.out.println("Years of study: " + s1.getYearsOfStudy());
		s1.incrementYear();
		System.out.println("Year of study after increment: " + s1.getYearsOfStudy() + "\n");
		
		
		StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString() + "\n");
        
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println("Standard: " + t.toStandard() + "\n");

        Time t2 = new Time(4, 24, 33);
        t.add(t2); 
        System.out.println("New time after add: " + t.toUniversal());
	}

}
