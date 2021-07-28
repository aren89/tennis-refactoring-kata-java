package kata;

import java.util.List;

import static java.util.Arrays.asList;

public class GameStatusPipeline {

    private final List<GameStatus> possibleStatus;

    public GameStatusPipeline(Players players) {
        this.possibleStatus = asList(
                new TieGame(players),
                new AlmostFinishedGame(players),
                new Game(players)
        );
    }

    public String score() {
        return possibleStatus.stream().filter(GameStatus::isMyStatus).findFirst().get().myScore();
    }
}
