package kata;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> players;

    public Players(Player player1, Player player2) {
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
    }

    public void addPointTo(String playerName) {
        players.forEach(p -> p.addPointIfIsMe(playerName));
    }

    public Player getPlayerOne() {
        return players.get(0);
    }

    public Player getPlayerTwo() {
        return players.get(1);
    }
}
