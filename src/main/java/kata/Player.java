package kata;

import java.util.Map;

public class Player {
    private final String name;
    private int points = 0;

    public Player(String name) {
        this.name = name;
    }

    private boolean is(String name) {
        return name.equals(this.name);
    }

    public void addPointIfIsMe(String name) {
        if (this.is(name)) {
            this.points++;
        }
    }

    public boolean hasSamePoints(Player other) {
        return other.points == points;
    }

    public boolean almostWin() {
        return points >= 4;
    }

    public boolean isInAdvantageAgainst(Player otherPlayer) {
        int minusResult = points - otherPlayer.points;
        return almostWin() && minusResult == 1;
    }

    public boolean isWinningAgainst(Player otherPlayer) {
        int minusResult = points - otherPlayer.points;
        return almostWin() && minusResult >= 2;
    }

    public String scoreNameBuilder(String value) {
        return value + this.name;
    }

    public String translatePoints(Map<Integer, String> scores) {
        return scores.getOrDefault(points, "Deuce");
    }
}
