/*
 * Monster is Entity for Monsters used in the Game
 *@author Noah Koch
 *
 */
package entities;

import interfaces.Text;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Monster implements Text {

    protected String name;
    protected String description;
    protected int hitPoints;
    protected int minDamage;
    protected int maxDamage;
    private final static Random random = new Random();
    private final static Set<Integer> monstersSeen = new HashSet<>();
    private final static int NUM_MONSTERS = 3;

    public Monster() {
    }
/*
 * Creates Random Instance to choose between one of the monster
 * @return Monster
 */
    public static Monster newRandomInstance() {
        if (monstersSeen.size() == NUM_MONSTERS) {
            monstersSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_MONSTERS);
        } while (monstersSeen.contains(i));
        monstersSeen.add(i);

        if (i == 0) {
            return new Monster("Harpy", HARPY, 38, 8, 12);
        } else if (i == 1) {
            return new Monster("Gargoyle", GARGOYLE, 26, 4, 6);
        } else {
            return new SemiBossMonster("Hobgoblin", HOBGOBLIN, 25, 5, 7);
        }
    }

    /*
     * Creates Random Instance to choose boss monster
     * @return Monster
     */
    public static Monster newBossInstance() {
        return new Monster("Dragon", DRAGON, 60, 10, 20);
    }

    private Monster(String name, String description, int hitPoints, int minDamage, int maxDamage) {
        this.name = name;
        this.description = description;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return "Monster HP: " + hitPoints;
    }

    public int attack() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public void defend(Player player) {
        int attackStrength = player.attack();
        hitPoints = (hitPoints > attackStrength) ? hitPoints - attackStrength : 0;
        System.out.printf("  %s hits %s for %d HP of damage (%s)\n", player, name, attackStrength,
                getStatus());
        if (hitPoints == 0) {
            System.out.println("  " + player + " transforms the skull of " + name
                    + " into a red pancake with his stone hammer");
        }
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }
}

class SemiBossMonster extends Monster {
    public SemiBossMonster(String n, String d, Integer h, Integer min, Integer max) {
        name = n;
        description = d;
        hitPoints = h;
        minDamage = min;
        maxDamage = max;
    }

    @Override
    public String getStatus() {
        return "SemiBossMonster HP: " + hitPoints;
    }
}
