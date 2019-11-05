/* @author Noah Koch
 *
 */
package game;

import entities.Dungeon;
import entities.Player;

import java.io.IOException;

public final class Game {

    private final Player player = Player.newInstance();

    public void play(){
        System.out.println("You are " + player + " " + player.getDescription());
        try {
            Dungeon.newInstance().startQuest(player);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        Game game = new Game();
        game.play();
    }

}
