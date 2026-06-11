package lab2.task4;

public class Series extends Circuit {
	private Circuit c1;
	private Circuit c2;
	public Series(Circuit c1,Circuit c2) {
		// TODO Auto-generated constructor stub
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return c1.getResistance() + c2.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return c1.getPotentialDiff() + c2.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		// TODO Auto-generated method stub
		double I = V / getResistance();
		double V1 = I * c1.getResistance();
		double V2 = I * c2.getResistance();
		c1.applyPotentialDiff(V1);
		c2.applyPotentialDiff(V2);
		

	}

}
