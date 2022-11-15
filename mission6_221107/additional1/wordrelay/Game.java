package mission6_221107.additional1.wordrelay;

import java.util.List;

public class Game {
    private Integer numberOfPlayers;
    private List<String> playerList;

    public Game(Integer numberOfPlayers, List<String> playerList) {
        this.numberOfPlayers = numberOfPlayers;
        this.playerList = playerList;
    }

    public void addPlayer(String name) {
        this.playerList.add(name);
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public List<String> getPlayerList() {
        return playerList;
    }
}
