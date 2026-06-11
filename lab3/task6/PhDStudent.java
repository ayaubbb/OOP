package lab3.task6;

public class PhDStudent extends Student {
	private String researchTopic;
	public PhDStudent(String name, int age, String major,String researchTopic) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.researchTopic = researchTopic;
	}
	
	public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD Student " + name + " cannot take a Dog!");
        } else {
            super.assignPet(pet);
        }
    }
	public String getOccupation() {
        return "PhD Student in " + getMajor() + ". Researching: " + researchTopic;
    }
	public String toString() {
        return super.toString() + ", Research Topic " + researchTopic;
    }

}
