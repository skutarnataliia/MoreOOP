package lotr;

import lotr.King;
import lotr.Elf;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            System.out.println("The characters are both alive!");
            c1.kick(c2);
            c2.kick(c1);
            System.out.println("They kicked each other!");
            System.out.println(c1);
            System.out.println(c2);
        }
        System.out.println("The end.");
    }
}
