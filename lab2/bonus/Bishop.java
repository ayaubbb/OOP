package lab2.bonus;

public class Bishop extends Piece {

	public Bishop(Position a,boolean isWhite) {
		// TODO Auto-generated constructor stub
		super(a, isWhite);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()); 
	}

}
