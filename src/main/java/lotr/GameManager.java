package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Here are your characters!");
        System.out.println(c1);
        System.out.println(c2);
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("The characters are both alive!");
            System.out.println("They kicked each other!");
            c1.kick(c2);
            c2.kick(c1);
            System.out.println(c1);
            System.out.println(c2);
        }
        System.out.println("Someone is dead!");
        System.out.println("The end.");
    }
}
