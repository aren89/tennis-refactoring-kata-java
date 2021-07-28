package kata;

import java.util.HashMap;
import java.util.Map;

public class Game implements GameStatus {

    private final Players players;
    private static final Map<Integer, String> NORMAL_POINT_NAME;

    static {
        NORMAL_POINT_NAME = new HashMap<>();
        NORMAL_POINT_NAME.put(0, "Love");
        NORMAL_POINT_NAME.put(1, "Fifteen");
        NORMAL_POINT_NAME.put(2, "Thirty");
        NORMAL_POINT_NAME.put(3, "Forty");
    }

    public Game(Players players) {
        this.players = players;
    }

    @Override
    public boolean isMyStatus() {
        return true;
    }

    @Override
    public String myScore() {
        return players.getPlayerOne().translatePoints(NORMAL_POINT_NAME) + "-" + players.getPlayerTwo().translatePoints(NORMAL_POINT_NAME);
    }
}
