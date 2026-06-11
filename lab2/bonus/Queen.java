package lab2.bonus;

public class Queen extends Piece {

	public Queen(Position a, boolean isWhite) {
		// TODO Auto-generated constructor stub
		super(a, isWhite);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && 
				(  (a.getX() == b.getX() || a.getY() == b.getY() )
				|| 
				(Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()) )  ); 
	}
}
