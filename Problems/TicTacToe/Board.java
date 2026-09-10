package Problems.TicTacToe;

public class Board {
    public char[][] board;
    public Board(){
        board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
    }

    public boolean isValidMove(int row , int col){
        return board[row][col]==' ';
    }
    
    public void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean hasWon(char symbol){
        //for row
         for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {

                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {

                return true;
            }
        }
        //fol 1st diagonal
        if(board[0][0]==symbol &&
            board[1][1]==symbol &&
            board[2][2]==symbol){
                return true;
        }

        //for 2nd diagonal
        if(board[0][2]==symbol &&
            board[1][1]==symbol &&
            board[2][0]==symbol){
                return true;
        }
        return false;
    }

    public boolean isFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' ')return false;
            }
        }
        return true;
    }

    public void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j<2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2){
                System.out.println("---------");
            }
        }
    }
}
