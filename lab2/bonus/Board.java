package lab2.bonus;
public class Board {
	private Piece[][] grid;
	private boolean isWhiteTurn = true;
	
	public Board() {
		// TODO Auto-generated constructor stub
		this.grid = new Piece[8][8];
		setupBoard();
	}
	
	private void setupBoard() {
        grid[0][0] = new Rook(new Position('a', 1), true);
        grid[1][0] = new Knight(new Position('b', 1), true);
        grid[2][0] = new Bishop(new Position('c', 1), true);
        grid[3][0] = new Queen(new Position('d', 1), true);
        grid[4][0] = new King(new Position('e', 1), true);
        grid[5][0] = new Bishop(new Position('f', 1), true);
        grid[6][0] = new Knight(new Position('g', 1), true);
        grid[7][0] = new Rook(new Position('h', 1), true);
        
        grid[0][1] = new Pawn(new Position('a', 2), true);
        grid[1][1] = new Pawn(new Position('b', 2), true);
        grid[2][1] = new Pawn(new Position('c', 2), true);
        grid[3][1] = new Pawn(new Position('d', 2), true);
        grid[4][1] = new Pawn(new Position('e', 2), true);
        grid[5][1] = new Pawn(new Position('f', 2), true);
        grid[6][1] = new Pawn(new Position('g', 2), true);
        grid[7][1] = new Pawn(new Position('h', 2), true);
        
        
        grid[0][7] = new Rook(new Position('a', 8), false);
        grid[1][7] = new Knight(new Position('b', 8), false);
        grid[2][7] = new Bishop(new Position('c', 8), false);
        grid[3][7] = new Queen(new Position('d', 8), false);
        grid[4][7] = new King(new Position('e', 8), false);
        grid[5][7] = new Bishop(new Position('f', 8), false);
        grid[6][7] = new Knight(new Position('g', 8), false);
        grid[7][7] = new Rook(new Position('h', 8), false);
        
        grid[0][6] = new Pawn(new Position('a', 7), false);
        grid[1][6] = new Pawn(new Position('b', 7), false);
        grid[2][6] = new Pawn(new Position('c', 7), false);
        grid[3][6] = new Pawn(new Position('d', 7), false);
        grid[4][6] = new Pawn(new Position('e', 7), false);
        grid[5][6] = new Pawn(new Position('f', 7), false);
        grid[6][6] = new Pawn(new Position('g', 7), false);
        grid[7][6] = new Pawn(new Position('h', 7), false);
    }
	
	public void display() {
		System.out.println("   a b c d e f g h");
		System.out.println("  -----------------");
	    for (int row = 7; row >= 0; row--) {
	        System.out.print((row + 1) + "| "); 
	        for (int col = 0; col < 8; col++) {
	        	
	            Piece p = grid[col][row];
	            if (p == null) {
	                System.out.print(". "); 
	            } else {
	                System.out.print(getSymbol(p) + " ");
	            }
	        }
	        System.out.println("|");
	    }
	    System.out.println("  -----------------");
	    System.out.println("   a b c d e f g h");
	}
	
	private String getSymbol(Piece p) {
	    String name = p.getClass().getSimpleName();

	    switch (name) {
	        case "King":   return p.isWhite ? "♔" : "♚";
	        case "Queen":  return p.isWhite ? "♕" : "♛";
	        case "Rook":   return p.isWhite ? "♖" : "♜";
	        case "Bishop": return p.isWhite ? "♗" : "♝";
	        case "Knight": return p.isWhite ? "♘" : "♞";
	        case "Pawn":   return p.isWhite ? "♙" : "♟";
	        default: return "?";
	    }
	}
	
	public boolean move(String from, String to) {
        if (from.length() < 2 || to.length() < 2) return false;
        int fX = from.charAt(0) - 'a';
        int fY = from.charAt(1) - '1';
        int tX = to.charAt(0) - 'a';
        int tY = to.charAt(1) - '1';

        if (fX < 0 || fX > 7 || fY < 0 || fY > 7 || tX < 0 || tX > 7 || tY < 0 || tY > 7) return false;

        Piece p = grid[fX][fY];
        if (p == null) {
            System.out.println("No piece at " + from);
            return false;
        }
        if (p.isWhite != isWhiteTurn) {
            System.out.println("It's " + (isWhiteTurn ? "White" : "Black") + "'s turn!");
            return false;
        }

        if (!canMoveWithMessages(fX, fY, tX, tY)) return false;

        Piece temp = grid[tX][tY];
        Position oldPos = p.a;
        grid[tX][tY] = p;
        grid[fX][fY] = null;
        p.a = new Position((char)('a' + tX), tY + 1);

        if (isInCheck(isWhiteTurn)) {
            grid[fX][fY] = p;
            grid[tX][tY] = temp;
            p.a = oldPos;
            System.out.println("You must protect your King!");
            return false;
        }
        
        if (p instanceof Pawn) {
            int promotionRow = p.isWhite ? 7 : 0; 
            if (tY == promotionRow) {
                grid[tX][tY] = new Queen(p.a, p.isWhite);
                System.out.println("Pawn promoted to Queen!");
            }
        }

        isWhiteTurn = !isWhiteTurn;
        if (isInCheck(isWhiteTurn)) {
            System.out.println("CHECK!");
            if (isCheckmate(isWhiteTurn)) {
                display();
                System.out.println("CHECKMATE! " + (isWhiteTurn ? "Black" : "White") + " wins!");
                System.exit(0);
            }
        }
        return true;
    }

    private boolean canMoveWithMessages(int fX, int fY, int tX, int tY) {
        if (fX == tX && fY == tY) return false;
        Piece p = grid[fX][fY];
        
        if (grid[tX][tY] != null && grid[tX][tY].isWhite == p.isWhite) {
            System.out.println("Cannot capture your own piece!");
            return false;
        }

        if (p instanceof Pawn) {
            int dx = Math.abs(tX - fX);
            int dy = tY - fY;
            if (dx == 0 && grid[tX][tY] != null) {
                System.out.println("Pawn cannot capture forward!");
                return false;
            }
            if (dx != 0 && grid[tX][tY] == null) {
                System.out.println("Pawn can only capture diagonally!");
                return false;
            }
        }

        if (!(p instanceof Knight) && isPathBlocked(fX, fY, tX, tY)) {
            System.out.println("Path is blocked!");
            return false;
        }

        if (!p.isLegalMove(new Position((char)('a' + tX), tY + 1))) {
            System.out.println("Illegal move for " + p.getClass().getSimpleName() + "!");
            return false;
        }
        return true;
    }

    private boolean canMoveSafely(int fX, int fY, int tX, int tY) {
        if (fX == tX && fY == tY) return false;
        Piece p = grid[fX][fY];
        if (grid[tX][tY] != null && grid[tX][tY].isWhite == p.isWhite) return false;
        if (p instanceof Pawn) {
            int dx = Math.abs(tX - fX);
            if (dx == 0 && grid[tX][tY] != null) return false;
            if (dx != 0 && grid[tX][tY] == null) return false;
        }
        if (!(p instanceof Knight) && isPathBlocked(fX, fY, tX, tY)) return false;
        return p.isLegalMove(new Position((char)('a' + tX), tY + 1));
    }

    private boolean isPathBlocked(int fX, int fY, int tX, int tY) {
        int dx = Integer.signum(tX - fX);//1 r t -1 l b 0 s
        int dy = Integer.signum(tY - fY);
        int x = fX + dx;
        int y = fY + dy;
        while (x != tX || y != tY) {
            if (x < 0 || x > 7 || y < 0 || y > 7) return true;
            if (grid[x][y] != null) return true;//если есть что-то то все блок
            x += dx; y += dy;
        }
        return false;
    }

    private boolean isInCheck(boolean white) {
        int kX = -1, kY = -1;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (grid[x][y] instanceof King && grid[x][y].isWhite == white) {
                    kX = x; kY = y; break;
                }
            }
        }
        if (kX == -1) return false;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece p = grid[x][y];
                if (p != null && p.isWhite != white) {
                    if (canAttack(x, y, kX, kY)) return true;
                }
            }
        }
        return false;
    }

    private boolean canAttack(int fX, int fY, int tX, int tY) {
        Piece p = grid[fX][fY];
        if (p instanceof Pawn) {
            int dx = Math.abs(tX - fX);
            int dy = tY - fY;
            return dx == 1 && (p.isWhite ? dy == 1 : dy == -1);
        }
        if (!(p instanceof Knight) && isPathBlocked(fX, fY, tX, tY)) return false;
        return p.isLegalMove(new Position((char)('a' + tX), tY + 1));
    }

    private boolean isCheckmate(boolean white) {
        for (int fX = 0; fX < 8; fX++) {
            for (int fY = 0; fY < 8; fY++) {
                Piece p = grid[fX][fY];
                if (p != null && p.isWhite == white) {
                    for (int tX = 0; tX < 8; tX++) {
                        for (int tY = 0; tY < 8; tY++) {
                            if (canMoveSafely(fX, fY, tX, tY)) {
                                Piece temp = grid[tX][tY];
                                Position oldP = p.a;
                                grid[tX][tY] = p; grid[fX][fY] = null;
                                p.a = new Position((char)('a' + tX), tY + 1);
                                boolean stillInCheck = isInCheck(white);
                                grid[fX][fY] = p; grid[tX][tY] = temp;
                                p.a = oldP;
                                if (!stillInCheck) return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public String getTurn() {
        return isWhiteTurn ? "White" : "Black";
    }
}


