public class NPC {
    /**
     *  NPC = Non-playable Character, that would sell items to the player, like weapons, health posions and so on.
     */


    private String name;
    private String position;
    private Inventory inventory;

    public NPC (String name,String position, Inventory inventory) {
        this.name = name;
        this.position = position;
        inventory = new Inventory();
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
