package lab2.task4;

public class Parallel extends Circuit {
	private Circuit c1, c2;
	public Parallel(Circuit c1,Circuit c2) {
		// TODO Auto-generated constructor stub
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return (c1.getResistance() * c2.getResistance()) / (c1.getResistance() + c2.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return c1.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		// TODO Auto-generated method stub
		c1.applyPotentialDiff(V);
		c2.applyPotentialDiff(V);
	}

}
