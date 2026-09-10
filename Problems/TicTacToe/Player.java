package Problems.TicTacToe;

public class Player {
    public String name;
    public char symbol;

    public Player(String name , char symbol){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public char getSymbol() {
        return symbol;
    }
}
