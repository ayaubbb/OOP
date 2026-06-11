package lab2.task2;

public class Knight extends Piece {

	public Knight(Position a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && 
				( (Math.abs(a.getX() - b.getX()) == 2 && Math.abs(a.getY() - b.getY()) == 1) 
				||
				(Math.abs(a.getX() - b.getX()) == 1 && Math.abs(a.getY() - b.getY()) == 2) ); 
	}
}
