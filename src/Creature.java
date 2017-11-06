import java.util.Random;

public class Creature {

    private String name;
    private int level;
    private int health;
    private double attack;
    private Random random;

    public Creature(String name, int level, int health, double attack, Inventory inventory) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
}
