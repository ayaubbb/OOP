package lab2.task4;
public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		// your code
		return Math.pow(getPotentialDiff(), 2) / getResistance();
	}
	public double getCurrent() {
		// your code
		return getPotentialDiff() / getResistance();
	}
}