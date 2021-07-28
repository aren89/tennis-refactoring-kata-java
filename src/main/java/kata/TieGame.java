package kata;

import java.util.HashMap;
import java.util.Map;

public class TieGame implements GameStatus {

    private final Players players;
    private static final Map<Integer, String> TIE_POINT_NAME;

    static {
        TIE_POINT_NAME = new HashMap<>();
        TIE_POINT_NAME.put(0, "Love-All");
        TIE_POINT_NAME.put(1, "Fifteen-All");
        TIE_POINT_NAME.put(2, "Thirty-All");
    }

    public TieGame(Players players) {
        this.players = players;
    }

    @Override
    public boolean isMyStatus() {
        return players.getPlayerOne().hasSamePoints(players.getPlayerTwo());
    }

    @Override
    public String myScore() {
        return players.getPlayerOne().translatePoints(TIE_POINT_NAME);
    }
}
