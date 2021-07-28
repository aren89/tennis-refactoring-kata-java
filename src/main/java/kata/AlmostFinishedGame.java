package kata;

public class AlmostFinishedGame implements GameStatus {

    private final Players players;

    public AlmostFinishedGame(Players players) {
        this.players = players;
    }

    @Override
    public boolean isMyStatus() {
        return players.getPlayerOne().almostWin() || players.getPlayerTwo().almostWin();
    }

    @Override
    public String myScore() {
        if (players.getPlayerOne().isInAdvantageAgainst(players.getPlayerTwo())) {
            return players.getPlayerOne().scoreNameBuilder("Advantage ");
        }
        if (players.getPlayerTwo().isInAdvantageAgainst(players.getPlayerOne())) {
            return players.getPlayerTwo().scoreNameBuilder("Advantage ");
        }
        if (players.getPlayerOne().isWinningAgainst(players.getPlayerTwo())) {
            return players.getPlayerOne().scoreNameBuilder("Win for ");
        }
        return players.getPlayerTwo().scoreNameBuilder("Win for ");

    }
}
