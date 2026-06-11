package lab2.task2;

public class Queen extends Piece {

	public Queen(Position a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && 
				(  (a.getX() == b.getX() || a.getY() == b.getY() )
				|| 
				(Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()) )  ); 
	}
}
