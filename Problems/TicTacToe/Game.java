package Problems.TicTacToe;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;
    
    public Game(Player player1 , Player player2){
        this.player1=player1;
        this.player2=player2;
        board= new Board();
        this.currentPlayer=player1;
    }

    public void makeMove(int row , int col , char symbol){

        if(!board.isValidMove(row, col)){
            System.out.println("Not A valid Move");
            return;
        }

        board.placeMove(row, col, symbol);
        board.printBoard();
        System.out.println();

        if(board.hasWon(symbol)){
            System.out.println("Game Over : "+ currentPlayer.getName()+ " has Won with "+currentPlayer.getSymbol());
            return;
        }
        if(board.isFull()){
            System.out.println("Game Draw");
            return;
        }

        switchPlayer();
        

    }
    
    public void switchPlayer(){
        if(currentPlayer==player1){
            currentPlayer=player2;
        }else{
            currentPlayer=player1;
        }
    }

    public boolean isGameOver(){
        return board.hasWon(currentPlayer.getSymbol()) || board.isFull();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
}
