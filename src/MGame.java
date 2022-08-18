import java.util.ArrayList;

public class MGame {
    private int roundCnt;

    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private Board board;

    public MGame(ArrayList<Player> players)
    {
        roundCnt = 0;
        this.players = players;
    }

    public void playGame(int n)
    {
        while (roundCnt < n)
        {
            playRound();
        }
    }
    private void playRound()
    {
        for(Player player : players)
        {
            player.takeTurn();
        }
    }
}
