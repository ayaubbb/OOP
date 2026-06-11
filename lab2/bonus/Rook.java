package lab2.bonus;
public class Rook extends Piece {
	
	public Rook(Position a,boolean isWhite) {
		super(a, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && (a.getX() == b.getX() || a.getY() == b.getY()); 
	}
		// anything else you need, continue
		//continue with other classes
}