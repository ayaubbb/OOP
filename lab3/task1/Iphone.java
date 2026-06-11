package lab3.task1;

public abstract class Iphone {
	protected String model;
	protected int battery = 100;
	
	public Iphone(String model,int battery) {
		// TODO Auto-generated constructor stub
		this.battery = battery;
		this.model = model;
	}
	
	void showAppleLogo() {
		System.out.println("Displaying apple icon");
	}
	
	abstract void unlock();
}
