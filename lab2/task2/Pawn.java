package lab2.task2;

public class Pawn extends Piece {

	public Pawn(Position a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	
	public boolean isLegalMove(Position b) {
		return super.isNotSamePosition(b) && a.getX() == b.getX() && b.getY() - a.getY() == 1; 
	}
}
