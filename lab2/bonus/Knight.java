package lab2.bonus;

public class Knight extends Piece {

	public Knight(Position a,boolean isWhite) {
		// TODO Auto-generated constructor stub
		super(a, isWhite);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && 
				( (Math.abs(a.getX() - b.getX()) == 2 && Math.abs(a.getY() - b.getY()) == 1) 
				||
				(Math.abs(a.getX() - b.getX()) == 1 && Math.abs(a.getY() - b.getY()) == 2) ); 
	}
}
