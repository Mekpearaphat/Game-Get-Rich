import java.util.ArrayList;

public class Player {
    public String name;

    private ArrayList<Die> dies;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dies, Board board, Piece piece)
    {
        this.name = name;
        this.dies = dies;
        this.board = board;
        this.piece = piece;
    }
    public void takeTurn()
    {
        int fv = 0;
        for(Die die : dies)
        {
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }
}
