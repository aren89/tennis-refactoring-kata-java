package kata;

public class TennisGame {

    private final Players players;

    public TennisGame(String player1Name, String player2Name) {
        players = new Players(new Player(player1Name), new Player(player2Name));
    }

    public void wonPoint(String playerName) {
        players.addPointTo(playerName);
    }

    public String getScore() {
        return new GameStatusPipeline(players).score();
    }
}
