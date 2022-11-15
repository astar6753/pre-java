package mission6_221107.additional1.wordrelay;

import java.util.List;

public class GameBuilder {
    private Integer numberOfPlayers;
    private List<String> playerList;

    public GameBuilder numberOfPlayers(String inputStr) {
        this.numberOfPlayers = Integer.parseInt(inputStr);
        return this;
    }

    public GameBuilder playerList(List<String> playerList) {
        this.playerList = playerList;
        return this;
    }

    public Game build() {
        return new Game(numberOfPlayers, playerList);
    }
}

