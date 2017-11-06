import java.util.Scanner;

public class Game implements IGame {

    private Creature c1;
    private Creature c2;

    public Game() {
        System.out.println("Game started");
        c1 = new Creature("Wolf",3,50,15.0,new Inventory());
        c2 = new Creature("Snake",1,30,10.0,new Inventory());
        Player p = new Player("Indianboy",new Inventory());
    }

    @Override
    public void play(String name) {
        System.out.println("There is a "+c1.getName()+" and a "+c2.getName()+" out there in your journey out of the wood.");
        System.out.println("You can choose to run away or fight them to go trough the road.");
        for (int i =0; i < 10; i++) {
            if (i%2==0) {
                System.out.println("The first creature you meet on your way is a "+c1.getName());
            } else {
                System.out.println("The first creature you meet on your way is a "+c2.getName());
            }
        }
        System.out.println("What do you do? Attack [1] or run away [2]?");
        Scanner sc = new Scanner(System.in);
        int answer = Integer.parseInt(sc.next());
        switch (answer) {
            case 1:

                break;
            case 2:

                break;
            default:
                break;
        }

    }

    @Override
    public void saveGame() {

    }

    @Override
    public void loadGame() {

    }


}
