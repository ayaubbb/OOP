package lab2.bonus;

public class Pawn extends Piece {

	public Pawn(Position a,boolean isWhite) {
		// TODO Auto-generated constructor stub
		super(a, isWhite);
	}
	
	public boolean isLegalMove(Position b) {
		int dx = Math.abs(b.getX() - a.getX());
	    int dy = b.getY() - a.getY();
	    
	    int direction = isWhite ? 1 : -1;
	    int startRow = isWhite ? 2 : 7; 
	    if (dx == 0) {
	        if (dy == direction) return true; 
	        if (dy == 2 * direction && a.getY() == startRow) return true; 
	    }
	    if (dx == 1 && dy == direction) return true;

	    return false;
	}
}
