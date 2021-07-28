package kata;

import java.util.HashMap;
import java.util.Map;

public class Score {

    private static final Map<Integer, String> NORMAL_POINT_NAME;
    private static final Map<Integer, String> TIE_POINT_NAME;

    static {
        NORMAL_POINT_NAME = new HashMap<>();
        NORMAL_POINT_NAME.put(0, "Love");
        NORMAL_POINT_NAME.put(1, "Fifteen");
        NORMAL_POINT_NAME.put(2, "Thirty");
        NORMAL_POINT_NAME.put(3, "Forty");

        TIE_POINT_NAME = new HashMap<>();
        TIE_POINT_NAME.put(0, "Love-All");
        TIE_POINT_NAME.put(1, "Fifteen-All");
        TIE_POINT_NAME.put(2, "Thirty-All");
    }

    public static String tie(Player player) {
        return TIE_POINT_NAME.getOrDefault(player.getPoints(), "Deuce");
    }

    public static String win(Player player) {
        return "Win for " + player.getName();
    }

    public static String advantage(Player player) {
        return "Advantage " + player.getName();
    }

    public static String normal(Player player1, Player player2) {
        return NORMAL_POINT_NAME.get(player1.getPoints()) + "-" + NORMAL_POINT_NAME.get(player2.getPoints());
    }
}
