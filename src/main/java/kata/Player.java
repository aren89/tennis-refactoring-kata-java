package kata;

public class Player {

    private int points;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        this.points++;
    }

    public boolean isTieWith(Player player2) {
        return points == player2.getPoints();
    }

    public boolean isInAdvantageAgainst(Player otherPlayer) {
        int minusResult = points - otherPlayer.getPoints();
        return points >= 4 && minusResult == 1;
    }

    public boolean isWinningAgainst(Player otherPlayer) {
        int minusResult = points - otherPlayer.getPoints();
        return points >= 4 && minusResult >= 2;
    }

    public String getName() {
        return name;
    }
}
