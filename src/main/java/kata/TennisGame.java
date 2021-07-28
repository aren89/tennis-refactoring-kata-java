package kata;

import static kata.Score.advantage;
import static kata.Score.normal;
import static kata.Score.tie;
import static kata.Score.win;

public class TennisGame {

    private final Player player1;
    private final Player player2;


    public TennisGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.addPoint();
        } else {
            player2.addPoint();
        }
    }

    public String getScore() {
        if (player1.isTieWith(player2)) {
            return tie(player1);
        }
        if (player1.isWinningAgainst(player2)) {
            return win(player1);
        }
        if (player1.isInAdvantageAgainst(player2)) {
            return advantage(player1);
        }
        if (player2.isWinningAgainst(player1)) {
            return win(player2);
        }
        if (player2.isInAdvantageAgainst(player1)) {
            return advantage(player2);
        }
        return normal(player1, player2);
    }
}
