package lab2.task2;

public class Bishop extends Piece {

	public Bishop(Position a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	
	public boolean isLegalMove(Position b) {
		// Check horizontal or vertical moves
		return super.isNotSamePosition(b) && Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()); 
	}

}
