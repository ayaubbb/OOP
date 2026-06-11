package lab3.task1;

public class Iphone15Promax extends Iphone implements WirelessChargable, WaterResistant {
	protected String typeOfSim;
	protected int depth = 6;
	
	public Iphone15Promax(String model, int battery,String typeOfSim,int depth) {
		super(model, battery);
		// TODO Auto-generated constructor stub
		this.typeOfSim = typeOfSim;
		this.depth = depth;
	}

	@Override
	public void submergedInWater(int depth) {
		// TODO Auto-generated method stub
		System.out.println("Surviving at " + depth + " meters depth.");

	}

	@Override
	public void chargeWireless() {
		// TODO Auto-generated method stub
		System.out.println("Charging on Magsafe");

	}

	@Override
	void unlock() {
		// TODO Auto-generated method stub
		System.out.println("Unlocking with face id");

	}
	
	public String gettypeOfSim() {
		return typeOfSim;
	}

}
