package lab2.bonus;

public class King extends Piece {

	public King(Position a,boolean isWhite) {
		super(a, isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && 
				Math.abs(a.getX() - b.getX()) <= 1 
				&& 
				Math.abs(a.getY() - b.getY()) <= 1; 
	}
}
