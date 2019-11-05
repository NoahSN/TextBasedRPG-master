/* @author Noah Koch
 *
 */
package entities;

import battle.Battle;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class Room {

    private final String description;
    private final Monster monster;
    private final Boolean isBossRoom;
    private final static Random random = new Random();
    private final static Set<Integer> roomsSeen = new HashSet<>();
    private final static int NUM_ROOMS = 7;

    private Room(String description, Monster monster, Boolean isBossRoom) {
        this.description = description;
        this.monster = monster;
        this.isBossRoom = isBossRoom;
    }

    public static Room newRegularInstance() {
        if (roomsSeen.size() == NUM_ROOMS) {
            roomsSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_ROOMS);
        } while (roomsSeen.contains(i));
        roomsSeen.add(i);

        String roomDescription = null;
        if (i == 0) {
            roomDescription = "a Starbucks coffee with Hipster";
        } else if (i == 1) {
            roomDescription = "a boring classroom with IT students";
        } else if (i == 2) {
            roomDescription = "a Media Mart at Black Friday";
        } else if (i == 3) {
            roomDescription = "a room with Developers that hadn't drank coffee today";
        } else if (i == 4) {
            roomDescription = "a forest at Uetliberg";
        } else if (i == 5) {
            roomDescription = "a dark room filled with NULL";
        } else if (i == 6) {
            roomDescription = "a pineapple under the sea";
        } else {
        }
        return new Room(roomDescription, Monster.newRandomInstance(), false);
    }

    public static Room newBossInstance() {
        return new Room("a huge cave called \"your dead lol\"", Monster.newBossInstance(),
                true);
    }

    public boolean isBossRoom() {
        return isBossRoom;
    }

    public boolean isComplete() {
        return !monster.isAlive();
    }

    @Override
    public String toString() {
        return description;
    }

    public void enter(Player player)  {
        System.out.println("You are in " + description);
        if (monster.isAlive()) {
            new Battle(player, monster);
        }
    }

}