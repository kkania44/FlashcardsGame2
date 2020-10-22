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

}
