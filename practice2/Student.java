package practice2;

public class Student {
	private  String name;
	private int id;
	private int yearsOfStudy;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.yearsOfStudy = 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYearsOfStudy() {
		return yearsOfStudy;
	}
	
	public void incrementYear() {
		yearsOfStudy++;
	}
}

