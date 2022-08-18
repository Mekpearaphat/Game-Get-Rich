public class Board {
    private Square[] squares;

    public Board()
    {
        squares = new Square[40];
    }

    public Square getSquare(Square oldSquare, int fv)
    {
        for (int i=0; i<squares.length; i++)
        {
            if(oldSquare.equals(squares[i]))
            {
                return squares[(i+fv)%40];
            }
        }
        return null;
    }
}
