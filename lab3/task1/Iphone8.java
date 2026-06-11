package lab3.task1;

public class Iphone8 extends Iphone implements WirelessChargable {
	protected String color;
	
	public Iphone8(String model, int battery,String color) {
		super(model, battery);
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	@Override
	public void chargeWireless() {
		// TODO Auto-generated method stub
		System.out.println("charging on Qi pad");
	}

	@Override
	void unlock() {
		// TODO Auto-generated method stub
		System.out.println("unlocking with touch id");

	}
	
	public String getColor() {
		return color;
	}

}
