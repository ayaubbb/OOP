package lab2.task2;

public class Position {
	public int x; // column
	public int y; //row
	
	public Position(char column, int row) {
		// TODO Auto-generated constructor stub
		this.x = column - 'a' + 1; 
        this.y = row;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
