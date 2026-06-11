package lab2.task2;

public class ChessTest {
    public static void main(String[] args) {
        Position start = new Position('a', 1);
        Position validKnightMove = new Position('b', 3);
        Position invalidKnightMove = new Position('a', 3);

        Piece knight = new Knight(start);
        
        System.out.println("Knight from a1 to b3: " + knight.isLegalMove(validKnightMove)); //t
        System.out.println("Knight from a1 to a3: " + knight.isLegalMove(invalidKnightMove)); //f

        Piece rook = new Rook(new Position('d', 4));
        System.out.println("Rook from d4 to d8: " + rook.isLegalMove(new Position('d', 8))); //t
        System.out.println("Rook from d4 to e5: " + rook.isLegalMove(new Position('e', 5))); //f
    }
}