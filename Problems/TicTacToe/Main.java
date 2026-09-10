package Problems.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        Game game = new Game(player1, player2);
        Scanner sc = new Scanner(System.in);

        while(!game.isGameOver()){
            System.out.println(game.getCurrentPlayer().getName()+"'s turn ");
            System.out.println("Enter row and column (0-2):");
            System.out.print("Row: ");
            int row = sc.nextInt();
            System.out.print("Column: ");
            int col = sc.nextInt();
            char symbol = game.getCurrentPlayer().getSymbol();

            game.makeMove(row, col, symbol);
        }

        // Example moves
        // game.makeMove(0, 0, player1.getSymbol());
        // game.makeMove(0, 1, player2.getSymbol());
        // game.makeMove(1, 1, player1.getSymbol());
        // game.makeMove(0, 2, player2.getSymbol());
        // game.makeMove(2, 2, player1.getSymbol()); // This move should result in a win for Player 1
    }
}
