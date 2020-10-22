package services;

import entities.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private static List<Player> players = new ArrayList<>();

    static {
        players.add(new Player("player1"));
        players.add(new Player("player2"));
        players.add(new Player("player3"));
        players.add(new Player("player4"));
    }

    public Player getPlayer(String name) {
        for (Player player: players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public Player addNewPlayer(String name) {
        if (getPlayer(name) == null) {
            Player player = new Player(name);
            players.add(player);
            return player;
        }
        return null;
    }

}
