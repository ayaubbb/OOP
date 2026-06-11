package lab2.bonus;
public abstract class Piece {
	Position a;
	public boolean isWhite;
	public abstract boolean isLegalMove(Position b);
	// anything else you need, continue
	
	public Piece(Position a, boolean isWhite) {
		this.a = a;
		this.isWhite = isWhite;
	}
	
	public boolean isNotSamePosition(Position b) {
		return !(a.getX() == b.getX() && a.getY() == b.getY());
	}
}
