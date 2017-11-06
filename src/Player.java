public class Player {

    /**
     * The player class is as it describes and most of its attributes would be final, as the player would upgrade its health, attack
     */

    private String name;
    private int level;
    private double health;
    private double attack;
    private String position;
    private Inventory inventory;

    public Player(String name, Inventory inventory) {
        this.name = name;
        this.level = 0;
        this.health = 20.0;
        this.attack = 5.0;
        inventory = new Inventory();
        this.inventory = inventory;
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

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void attack() {

    }

    public void flee() {
        System.out.println("You just ran away, the game is over!");
    }

    public void takeItem(Item item) {

    }

    public void dropItem(Item item) {

    }
}
