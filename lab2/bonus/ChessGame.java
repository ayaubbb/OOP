package lab2.bonus;
import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board myBoard = new Board();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            myBoard.display(); 
            System.out.println("Current turn: " + myBoard.getTurn());
            System.out.println("Enter move (e.g. a2 a4) or 'exit':");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) break;
            
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                if (!myBoard.move(parts[0], parts[1])) {
                    System.out.println("Invalid move! Try again.");
                }
            } else {
                System.out.println("Invalid format! Use 'a2 a4'");
            }
        }
        scanner.close();
    }
}